package com.example.cheng.android.Permission;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import permissions.dispatcher.NeedsPermission;
import permissions.dispatcher.OnNeverAskAgain;
import permissions.dispatcher.OnPermissionDenied;
import permissions.dispatcher.OnShowRationale;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.RuntimePermissions;

@RuntimePermissions
public class PermissionUtilsActivity extends AppCompatActivity {

    @BindView(R.id.call_phone)
    TextView callPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_utils);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.call_phone)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.call_phone:
                PermissionUtilsActivityPermissionsDispatcher.callWithCheck(PermissionUtilsActivity.this);
                break;
        }
    }

    /**
     * 需要请求权限
     */
    @NeedsPermission(Manifest.permission.CALL_PHONE)
    public void call() {
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
     * 为何请求权限
     * @param request
     */
    @OnShowRationale(Manifest.permission.CALL_PHONE)
    void  showWhy(final PermissionRequest request){
        new AlertDialog.Builder(this)
                .setMessage("提示用户为何开启此权限")
                .setPositiveButton("知道了", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        request.proceed();
                    }
                }).show();
    }

    /**
     * 拒绝
     */
    @OnPermissionDenied(Manifest.permission.CALL_PHONE)
    void  showDeined(){
        Toast.makeText(this,"用户拒绝了权限",Toast.LENGTH_LONG).show();
    }

    @OnNeverAskAgain(Manifest.permission.CALL_PHONE)
    void showNotAsk(){
        new AlertDialog.Builder(this)
                .setMessage("该功能需要访问电话权限，不开启无法正常工作！")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).show();
    }



}
