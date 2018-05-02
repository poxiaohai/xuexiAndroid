package com.example.cheng.android.huanxin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FriendListActivity extends AppCompatActivity {


    @BindView(R.id.Lv_FriendList)
    RecyclerView LvFriendList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_list);
        ButterKnife.bind(this);
    }
}
