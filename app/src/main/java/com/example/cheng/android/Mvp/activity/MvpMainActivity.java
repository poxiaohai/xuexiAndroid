package com.example.cheng.android.Mvp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.cheng.android.Mvp.http.utils.HomeListService;
import com.example.cheng.android.Mvp.http.utils.RetrofitUtils;
import com.example.cheng.android.Mvp.model.ArticleListBean;
import com.example.cheng.android.Mvp.utils.BaseUtil;
import com.example.cheng.android.R;
import com.example.cheng.android.Scroll.AndroidScrollActivity;
import com.socks.library.KLog;

import java.util.List;
import java.util.Observable;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MvpMainActivity extends AppCompatActivity {
    private HomeListService mHomeListService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_main);
//        mHomeListService = RetrofitUtils.createApi(MvpMainActivity.this, HomeListService.class);
//        mHomeListService.getHomeArticleList("growthhacker",10,20)
//                .subscribeOn(Schedulers.io())
//                .observeOn(Schedulers.io())
//                .map(new Func1<List<ArticleListBean>, List<ArticleListBean>>() {
//                    @Override
//                    public List<ArticleListBean> call(List<ArticleListBean> articleListBeans) {
//                        for (ArticleListBean articleListBean : articleListBeans) {
//                            articleListBean.setSummary(BaseUtil.delHTMLTag(articleListBean.getSummary()));
//                            articleListBean.setContent(BaseUtil.delHTMLTag(articleListBean.getContent()));
//                        }
//                        return articleListBeans;
//                    }
//                }).observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<List<ArticleListBean>>() {
//                    @Override
//                    public void onCompleted() {
//                        Toast.makeText(MvpMainActivity.this,"onCompleted",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Toast.makeText(MvpMainActivity.this,"onError",Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onNext(List<ArticleListBean> articleListBeans) {
//                        KLog.e(articleListBeans.size()+"");
//                    }
//                });
    }
}
