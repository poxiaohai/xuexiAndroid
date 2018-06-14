package com.example.cheng.android.youmeng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cheng.android.BaseActivity;
import com.example.cheng.android.R;
import com.umeng.analytics.MobclickAgent;

public class YoumengActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youmeng);
        inint();
    }

    private void inint() {
        try {
            TextView textView=null;
            textView.setText("mmm");
        }catch (Exception e){
            MobclickAgent.reportError(YoumengActivity.this,e.getMessage());
        }
    }
}
