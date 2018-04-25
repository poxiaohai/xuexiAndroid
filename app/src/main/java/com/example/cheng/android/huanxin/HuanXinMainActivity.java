package com.example.cheng.android.huanxin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cheng.android.R;
import com.hyphenate.EMCallBack;
import com.hyphenate.EMConnectionListener;
import com.hyphenate.EMError;
import com.hyphenate.chat.EMClient;
import com.hyphenate.exceptions.HyphenateException;
import com.hyphenate.util.NetUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HuanXinMainActivity extends AppCompatActivity {

    @BindView(R.id.zhuce)
    TextView zhuce;
    @BindView(R.id.logout)
    TextView logout;
    @BindView(R.id.login)
    TextView login;
    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.password)
    EditText password;
    private  String mUserName;
    private  String mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huan_xin_main);
        ButterKnife.bind(this);
        //注册一个监听连接状态的listener
        EMClient.getInstance().addConnectionListener(new MyConnectionListener());
    }

    @OnClick({R.id.zhuce, R.id.login, R.id.logout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.zhuce:
                mUserName=username.getText().toString();
                mPassword=password.getText().toString();
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            createAccount();
                        } catch (HyphenateException e) {
                            Log.e("==========", e.getMessage());
//                            Toast.makeText(HuanXinMainActivity.this, "注册失败", Toast.LENGTH_LONG).show();
                        }
                    }
                }.start();

                break;

            case R.id.login:
                login();
                break;

            case R.id.logout:
                logout();
                break;

        }

    }

    private void logout() {
        EMClient.getInstance().logout(true, new EMCallBack() {

            @Override
            public void onSuccess() {
                Log.e("=======", "退出成功");
            }

            @Override
            public void onProgress(int progress, String status) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onError(int code, String message) {
                // TODO Auto-generated method stub
                Log.e("=======", "退出失败");
            }
        });
    }

    private void login() {
        mUserName=username.getText().toString();
        mPassword=password.getText().toString();
        EMClient.getInstance().login(mUserName, mPassword, new EMCallBack() {//回调
            @Override
            public void onSuccess() {
                EMClient.getInstance().groupManager().loadAllGroups();
                EMClient.getInstance().chatManager().loadAllConversations();
                Log.e("=======", "登录聊天服务器成功！");
            }

            @Override
            public void onProgress(int progress, String status) {

            }

            @Override
            public void onError(int code, String message) {
                Log.e("=======", "登录聊天服务器失败！");
            }
        });
    }

    private void createAccount() throws HyphenateException {
        EMClient.getInstance().createAccount(mUserName, mPassword);//同步方法
    }


    //实现ConnectionListener接口
    private class MyConnectionListener implements EMConnectionListener {
        @Override
        public void onConnected() {
        }

        @Override
        public void onDisconnected(final int error) {
            runOnUiThread(new Runnable() {

                @Override
                public void run() {
                    if (error == EMError.USER_REMOVED) {
                        // 显示帐号已经被移除
                    } else if (error == EMError.USER_LOGIN_ANOTHER_DEVICE) {
                        // 显示帐号在其他设备登录
                    } else {
                        if (NetUtils.hasNetwork(HuanXinMainActivity.this)) {
                            //连接不到聊天服务器
                        } else {
                            //当前网络不可用，请检查网络设置
                        }
                    }
                }
            });
        }
    }


}
