package com.example.cheng.android.Thead;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SubTheadMessageActivity extends AppCompatActivity {

    @BindView(R.id.btn2)
    TextView btn2;
    private Handler childHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_thead_message);
        ButterKnife.bind(this);

        new Thread(new Runnable() {

            @Override
            public void run() {
                Looper.prepare();
                childHandler = new Handler() {
                    @Override
                    public void handleMessage(Message msg) {
                        super.handleMessage(msg);
                        Log.e("=========","这个消息是从-->>" + msg.obj + "过来的，在" + "btn的子线程当中" + "中执行的");
                    }

                };
                Looper.loop();//开始轮循

            }
        }).start();




    }


    @OnClick(R.id.btn2)
    public void onViewClicked() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                Message msg = childHandler.obtainMessage();
                msg.obj = "btn2当中子线程";
                childHandler.sendMessage(msg);
            }
        }).start();

    }
}
