package com.example.cheng.android.Mvp.presenter;

import android.content.Context;
import android.view.View;

import com.example.cheng.android.Mvp.http.utils.HomeListService;
import com.example.cheng.android.Mvp.http.utils.RetrofitUtils;
import com.example.cheng.android.Mvp.model.ArticleListBean;
import com.example.cheng.android.Mvp.utils.BaseUtil;
import com.example.cheng.android.Mvp.view.HomeListView;

import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by cheng on 2018/6/27.
 */

public class HomePresenter extends BasePresenter<HomeListView> {
    public static final int LIMIT = 10;
    private final HomeListService homeListService;
    private Subscription mSubscription;
    private static final String tag = "growthhacker";

    public HomePresenter(Context context) {
        homeListService = RetrofitUtils.createApi(context, HomeListService.class);
    }

    @Override
    public void attachView(HomeListView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
        if (mSubscription != null) mSubscription.unsubscribe();
    }

    public void loadList(final int page) {
        checkViewAttached();

        String date = BaseUtil.getNYYMMDD(1 - page);

        int offset = (page - 1) * LIMIT;


        mSubscription = homeListService.getHomeArticleList(tag, LIMIT, offset)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .map(new Func1<List<ArticleListBean>, List<ArticleListBean>>() {
                    @Override
                    public List<ArticleListBean> call(List<ArticleListBean> articleListBeanList) {
                        for (ArticleListBean articleListBean : articleListBeanList) {
                            articleListBean.setSummary(BaseUtil.delHTMLTag(articleListBean.getSummary()));
                            articleListBean.setContent(BaseUtil.delHTMLTag(articleListBean.getContent()));
                        }
                        return articleListBeanList;
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ArticleListBean>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        getMvpView().showError(e.getMessage(), new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                            }
                        });
                    }

                    @Override
                    public void onNext(List<ArticleListBean> articleListBeanList) {
                        if (page == 1) {
                            getMvpView().refresh(articleListBeanList);
                        } else {
                            getMvpView().loadMore(articleListBeanList);
                        }
                    }
                });

    }


}
