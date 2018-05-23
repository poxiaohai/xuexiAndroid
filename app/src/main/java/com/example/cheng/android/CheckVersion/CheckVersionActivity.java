package com.example.cheng.android.CheckVersion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.allenliu.versionchecklib.core.AllenChecker;
import com.allenliu.versionchecklib.core.VersionDialogActivity;
import com.allenliu.versionchecklib.core.VersionParams;
import com.example.cheng.android.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckVersionActivity extends AppCompatActivity {

    @BindView(R.id.Tvshenji)
    TextView Tvshenji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_version);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.Tvshenji)
    public void onViewClicked(View view) {
        switch (view.getId()){
            case R.id.Tvshenji:
                updateApp();
                break;
        }
    }

    private void updateApp() {
        //Todo 网络请求
         VersionParams.Builder builder =
                 new VersionParams.Builder()
//                         .setHttpHeaders(headers)
//                .setRequestMethod(requestMethod)
//                .setRequestParams(httpParams)
                         .setRequestUrl("http://www.baidu.com")
//                .setDownloadAPKPath(getApplicationContext().getFilesDir()+"/")
        .setService(DemoService.class);
        stopService(new Intent(this, DemoService.class));
        //更新界面选择
//        builder.setCustomDownloadActivityClass(VersionDialogActivity.class);
        //下载进度界面选择
        builder.setCustomDownloadActivityClass(VersionDialogActivity.class);
        //如果本地有缓存，是否强制重新下载apk(设置false会如果下载了安装包而用户没有安装则不会再次下载)
        builder.setForceRedownload(false);
        //版本dialog Activity,使用默认界面不指定
//        builder.setCustomDownloadActivityClass(CheckVersionActivity.class);
        builder.setSilentDownload(false);
        AllenChecker.startVersionCheck(this, builder.build());
    }
}
