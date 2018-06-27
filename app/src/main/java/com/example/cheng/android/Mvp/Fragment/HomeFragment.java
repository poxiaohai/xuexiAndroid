package com.example.cheng.android.Mvp.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cheng.android.Mvp.HomeListAdapter;
import com.example.cheng.android.Mvp.http.utils.HomeListService;
import com.example.cheng.android.Mvp.http.utils.RetrofitUtils;
import com.example.cheng.android.Mvp.model.ArticleListBean;
import com.example.cheng.android.Mvp.presenter.HomePresenter;
import com.example.cheng.android.Mvp.utils.BaseUtil;
import com.example.cheng.android.Mvp.utils.GsonUtil;
import com.example.cheng.android.Mvp.view.HomeListView;
import com.example.cheng.android.Mvp.widget.loading.ProgressView;
import com.example.cheng.android.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.fangx.haorefresh.HaoRecyclerView;
import me.fangx.haorefresh.LoadMoreListener;

/**
 * Created by cheng on 2018/6/27.
 */

public class HomeFragment extends Fragment implements HomeListView {
    @BindView(R.id.swiperefresh)
    SwipeRefreshLayout swiperefresh;
    @BindView(R.id.hao_recycleview)
    HaoRecyclerView hao_recycleview;
    private HomeListService mHomeListService;
    private HomePresenter homePresenter;
    private HomeListAdapter homeListAdapter;
    private ArrayList<ArticleListBean> listData = new ArrayList<>();
    private int page = 1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.layout_home_fragment, null);
        ButterKnife.bind(this, view);
        mHomeListService= RetrofitUtils.createApi(getActivity(),HomeListService.class);
        inint();
        return view;
    }

    private void inint() {
        homeListAdapter = new HomeListAdapter(getActivity(), listData);
        hao_recycleview.setAdapter(homeListAdapter);

        swiperefresh.setColorSchemeResources(R.color.textBlueDark, R.color.textBlueDark, R.color.textBlueDark,
                R.color.textBlueDark);

        swiperefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                page = 1;
                homePresenter.loadList(page);
            }
        });

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        hao_recycleview.setLayoutManager(layoutManager);

        //设置自定义加载中和到底了效果
        ProgressView progressView = new ProgressView(getActivity());
        progressView.setIndicatorId(ProgressView.BallPulse);
        progressView.setIndicatorColor(0xff69b3e0);
        hao_recycleview.setFootLoadingView(progressView);

        TextView textView = new TextView(getActivity());
        textView.setText("已经到底啦~");
        hao_recycleview.setFootEndView(textView);

        hao_recycleview.setLoadMoreListener(new LoadMoreListener() {
            @Override
            public void onLoadMore() {
                page++;
                homePresenter.loadList(page);
            }
        });


        homePresenter = new HomePresenter(getActivity());
        homePresenter.attachView(this);
        //初次加载
        page = 1;
        homePresenter.loadList(page);

    }


    @Override
    public void refresh(List<ArticleListBean> data) {
        hao_recycleview.refreshComplete();
        hao_recycleview.loadMoreComplete();
        swiperefresh.setRefreshing(false);
        listData.clear();
        listData.addAll(data);
        homeListAdapter.notifyDataSetChanged();
    }

    @Override
    public void loadMore(List<ArticleListBean> data) {
        if (BaseUtil.isEmpty(data)) {
            hao_recycleview.loadMoreEnd();
        } else {
            listData.addAll(data);
            homeListAdapter.notifyDataSetChanged();
            hao_recycleview.loadMoreComplete();
        }
    }

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener, int imageId) {

    }

    @Override
    public void showNetError(View.OnClickListener onClickListener) {

    }
}
