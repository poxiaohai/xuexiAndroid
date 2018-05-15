package com.example.cheng.android;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.cookie.store.PersistentCookieStore;
import com.socks.library.KLog;
import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;

import java.util.logging.Level;

/**
 * Created by cheng on 2018/4/25.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initoptions();
        Bugly.init(this, "f9a9490b27", true);
        initOkgo();
        initLogo();
    }

    private void initLogo() {
        KLog.init(BuildConfig.DEBUG);
    }

    private void initOkgo() {
        OkGo.init(this);
    }

    /**
     * 初始化环信配置
     */
    private void initoptions() {
        EMOptions options = new EMOptions();
// 默认添加好友时，是不需要验证的，改成需要验证
        options.setAcceptInvitationAlways(false);
// 是否自动将消息附件上传到环信服务器，默认为True是使用环信服务器上传下载，如果设为 false，需要开发者自己处理附件消息的上传和下载
//        options.setAutoTransferMessageAttachments(true);
// 是否自动下载附件类消息的缩略图等，默认为 true 这里和上边这个参数相关联
//        options.setAutoDownloadThumbnail(true);
//初始化
        EMClient.getInstance().init(this, options);
//在做打包混淆时，关闭debug模式，避免消耗不必要的资源
        EMClient.getInstance().setDebugMode(true);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);


        // 安装tinker
        Beta.installTinker();
    }
}
