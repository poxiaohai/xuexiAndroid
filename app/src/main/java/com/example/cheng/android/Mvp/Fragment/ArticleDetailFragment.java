package com.example.cheng.android.Mvp.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cheng.android.R;

/**
 * Created by cheng on 2018/6/28.
 */

public class ArticleDetailFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
      View view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_article_detail,null);
        return view;
    }
}
