package com.example.cheng.android.Volley;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.cheng.android.R;
import com.example.cheng.android.model.IpModel;
import com.example.cheng.android.model.JsonModel;
import com.google.gson.Gson;
import com.socks.library.KLog;

import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VolleyActivity extends AppCompatActivity {

    @BindView(R.id.stringTv)
    TextView stringTv;
    @BindView(R.id.image1)
    ImageView imageView;
    RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volley);
        ButterKnife.bind(this);
        mQueue= Volley.newRequestQueue(getApplicationContext());
    }

    @OnClick({R.id.stringTv,R.id.JsonObjectRequest,R.id.loadimage})
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.stringTv:
                RequestData();
                break;
            case R.id.JsonObjectRequest:
                JsonRequest();
                break;

            case R.id.loadimage:
                loadImage();
                break;

        }
    }

    private void loadImage() {
        ImageRequest imageRequest=new ImageRequest("https://img.zcool.cn/community/0174295541fe180000019ae91f2478.jpg@2o.jpg", new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                imageView.setImageBitmap(response);

            }
        }, 0, 0, Bitmap.Config.RGB_565, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                imageView.setImageResource(R.mipmap.ic_launcher);
            }
        });

        mQueue.add(imageRequest);
    }

    private void JsonRequest() {
        JsonObjectRequest mJsonObjectRequest=new JsonObjectRequest(Request.Method.GET,
                "http://gank.io/api/data/Android/10/1",
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                      //  KLog.e(response.toString());
                        Gson gson=new Gson();
                        JsonModel jsonModel=gson.fromJson(response.toString(),JsonModel.class);
                        KLog.e(jsonModel.toString());
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

        StringRequest mStringRequest=new StringRequest(Request.Method.POST, "https://www.baidu.com/", new Response.Listener<String>() {
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
