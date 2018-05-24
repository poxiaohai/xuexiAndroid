package com.example.cheng.android.Volley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cheng.android.R;
import com.example.cheng.android.model.IpModel;
import com.google.gson.Gson;
import com.socks.library.KLog;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VolleyActivity extends AppCompatActivity {

    @BindView(R.id.stringTv)
    TextView stringTv;
    RequestQueue mQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);
        ButterKnife.bind(this);
        mQueue= Volley.newRequestQueue(getApplicationContext());
    }

    @OnClick({R.id.stringTv,R.id.JsonObjectRequest})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.stringTv:
                RequestData();
                break;
            case R.id.JsonObjectRequest:
                JsonRequest();
                break;

        }
    }

    private void JsonRequest() {
        JsonObjectRequest mJsonObjectRequest=new JsonObjectRequest(Request.Method.POST,
                "http://ip.taobao.com/service/getIpInfo.php?ip=59.108.54.37",
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        KLog.e(response.toString());
                        IpModel model=new Gson().fromJson(response.toString(),IpModel.class);
                        KLog.e(model.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                KLog.e(error);
            }
        });
        mQueue.add(mJsonObjectRequest);

    }

    private void RequestData() {

        StringRequest mStringRequest=new StringRequest(Request.Method.GET, "https://www.baidu.com/", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                KLog.e(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            KLog.e(error);
            }
        });
        mQueue.add(mStringRequest);
    }
}
