package com.example.cheng.android.UI;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cheng.android.R;

/**
 * 减少一层渲染
 */
public class mergeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merge);
    }
}
