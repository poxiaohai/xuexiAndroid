package com.example.cheng.android.CheckVersion;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.allenliu.versionchecklib.core.AVersionService;
import com.example.cheng.android.R;
import com.socks.library.KLog;

public class DemoService extends AVersionService {
    public DemoService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onResponses(AVersionService service, String response) {
        KLog.e(response);
        showVersionDialog("http://down1.uc.cn/down2/zxl107821.uc/miaokun1/UCBrowser_V11.5.8.945_android_pf145_bi800_(Build170627172528).apk", "检测到新版本", getString(R.string.updatecontent));
    }
}
