package com.example.cheng.android.Mvp.view;

import com.example.cheng.android.Mvp.model.ArticleListBean;

import java.util.List;


/**
 * Created by fangxiao on 16/1/5.
 */
public interface HomeListView extends MvpView {

    void refresh(List<ArticleListBean> data);

    void loadMore(List<ArticleListBean> data);

}
