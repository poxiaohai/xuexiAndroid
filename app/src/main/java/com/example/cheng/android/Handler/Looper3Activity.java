package com.example.cheng.android.Handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Looper3Activity extends AppCompatActivity {

    @BindView(R.id.sendmsg)
    TextView sendmsg;
    @BindView(R.id.shownub)
    TextView shownub;
 private SubThread mSubThread;
    private int mCount=0;
    private Handler mHandler1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_looper3);
        ButterKnife.bind(this);
        mHandler1=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                // TODO Auto-generated method stub
                shownub.setText("What="+msg.what+"\n arg1="+msg.arg1);
                super.handleMessage(msg);
            }
        };

        mSubThread=new SubThread(mHandler1);
        mSubThread.start();
    }

    @OnClick({R.id.sendmsg, R.id.shownub})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.sendmsg:
                Handler handler=mSubThread.getHandler();
                if(handler != null){
                    handler.sendEmptyMessage(mCount++);
                }
                break;
            case R.id.shownub:
                break;
        }
    }
}
