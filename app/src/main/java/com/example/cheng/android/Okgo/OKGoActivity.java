package com.example.cheng.android.Okgo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.HttpUtils;
import com.example.cheng.android.R;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.request.BaseRequest;
import com.socks.library.KLog;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Response;

public class OKGoActivity extends AppCompatActivity {

    @BindView(R.id.textview1)
    TextView textview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okgo);
        ButterKnife.bind(this);
        KLog.e("qqqq");
    }

    @OnClick({R.id.textview1})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.textview1:
                requestData();
                break;
        }
    }

    private void requestData() {
//        HttpUtils.post(OKGoActivity.this, "http://gank.io/api/data/Android/10/1", null, new StringCallback() {
//            @Override
//            public void onSuccess(String s, Call call, Response response) {
//                KLog.json(s);
//            }
//
//            @Override
//            public void onBefore(BaseRequest request) {
//                super.onBefore(request);
//            }
//
//            @Override
//            public void onError(Call call, Response response, Exception e) {
//                super.onError(call, response, e);
//                KLog.e(e.toString());
//            }
//
//            @Override
//            public void onAfter(String s, Exception e) {
//                super.onAfter(s, e);
//            }
//        });

        OkGo.get("http://gank.io/api/data/Android/10/1")
                .tag(this)
                .cacheMode(CacheMode.DEFAULT)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        String json=s;
                        KLog.e(json);

                    }

                    @Override
                    public void onError(Call call, Response response, Exception e) {
                        super.onError(call, response, e);
                    }
                });
    }
}
