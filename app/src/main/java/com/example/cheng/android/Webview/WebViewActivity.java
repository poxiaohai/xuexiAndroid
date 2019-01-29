package com.example.cheng.android.Webview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.example.cheng.android.R;

public class WebViewActivity extends AppCompatActivity {
    private WebView mwebview;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mwebview=findViewById(R.id.mwebview);
        WebSettings webSettings = mwebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.addJavascriptInterface(new JSHook(), "hello");
        mwebview.loadUrl("http://192.168.199.147:8080/xiaopiao_war_exploded/");
        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mwebview.loadUrl("javascript:show('"+"hahaha"+"')");
            }
        });
    }

    public class JSHook{
        @JavascriptInterface
       public  void  Toash(String json){
           Toast.makeText(WebViewActivity.this,json,Toast.LENGTH_LONG).show();
       }
    }
}
