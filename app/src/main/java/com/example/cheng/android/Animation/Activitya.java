package com.example.cheng.android.Animation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cheng.android.R;

import java.io.IOException;
import java.io.InputStream;

public class Activitya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitya);
        BitmapFactory.Options options=new BitmapFactory.Options();
        /**
         *options.inPreferredConfig=Bitmap.Config.ARGB_565; 16位 2字节
         * options.inPreferredConfig=Bitmap.Config.ALPHA_8; 8位 1字节
         options.inPreferredConfig=Bitmap.Config.ARGB_4444; 14 位  2字节
         options.inPreferredConfig=Bitmap.Config.ARGB_8888; 32位  4字节
         */
        options.inPreferredConfig=Bitmap.Config.ALPHA_8;
        options.inPreferredConfig=Bitmap.Config.ARGB_4444;
        options.inPreferredConfig=Bitmap.Config.ARGB_8888;
        /*加载部分图片资源
         */
        InputStream inputStream = null;
        try {
            BitmapRegionDecoder bitmapRegionDecoder=BitmapRegionDecoder.newInstance(inputStream,false);
       Bitmap bitmap=bitmapRegionDecoder.decodeRegion(new Rect(100,100,100,100),options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
