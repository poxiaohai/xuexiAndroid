package com.example.cheng.android.Thead;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TheadActivity extends AppCompatActivity {

    @BindView(R.id.textview1)
    TextView textview1;
    @BindView(R.id.textview2)
    TextView textview2;
    @SuppressLint("HandlerLeak")
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    Log.e("===========", (String) msg.obj);
                    break;
                case 1:
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thead);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.textview1, R.id.textview2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textview1:
                new  Thread(){
                    @Override
                    public void run() {
                        Message message = new Message();
                        message.what=0;
                        message.obj = "子线程发送的消息Hi~Hi";
                        mHandler .sendMessage(message);
                    }
                }.start();
                break;
            case R.id.textview2:
                Intent intent=new Intent(TheadActivity.this,Main2SubTheadActivity.class);
                startActivity(intent);
                break;
        }
    }
}
