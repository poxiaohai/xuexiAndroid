package com.example.cheng.android.Permission;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PermissionActivity extends AppCompatActivity {

    @BindView(R.id.callPhone)
    TextView callPhone;
    private int Call_phone=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.callPhone)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.callPhone:
                callphone();
                break;
        }
    }

    private void callphone() {
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE}, Call_phone);
        }else {
            callPhoneNauber();
        }
    }

    private void callPhoneNauber() {
        Intent intent=new Intent(Intent.ACTION_CALL);
        Uri data=Uri.parse("tel:100086");
        intent.setData(data);
        try{
            startActivity(intent);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *
     * @param requestCode
     * @param permissions 所有的权限
     * @param grantResults 通过的权限
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode==Call_phone){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                callPhoneNauber();
            }else {
                Toast.makeText(PermissionActivity.this,"权限被拒绝",Toast.LENGTH_LONG).show();
            }
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}
