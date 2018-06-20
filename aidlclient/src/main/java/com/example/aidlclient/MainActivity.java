package com.example.aidlclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.cheng.android.IDataInterface;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private  TextView startService,ipcservice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService=findViewById(R.id.startservice);
        startService.setOnClickListener(this);
        ipcservice=findViewById(R.id.ipcservice);
        ipcservice.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.startservice:
              Intent intent=new Intent();
              intent.setAction("com.cfr.demo.IDataInterface");
//              intent.s
                break;
            case R.id.ipcservice:
                break;
        }

    }
}
