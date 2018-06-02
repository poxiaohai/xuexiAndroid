package com.example.cheng.android.Handler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HanlderListActivity extends AppCompatActivity {

    @BindView(R.id.text1)
    TextView text1;
    @BindView(R.id.text2)
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanlder_list);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.text1, R.id.text2,R.id.suiji})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.text1:
                Intent intent=new Intent(HanlderListActivity.this,HandlerMainActivity.class);
                startActivity(intent);
                break;

            case R.id.text2:
                Intent intent1=new Intent(HanlderListActivity.this,SubThreadActivity.class);
                startActivity(intent1);
                break;
            case R.id.suiji:
                Intent intent2=new Intent(HanlderListActivity.this,Looper3Activity.class);
                startActivity(intent2);
                break;
        }
    }
}
