package com.example.cheng.android;

import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.multidex.MultiDex;

import com.example.cheng.GreenDao.DaoMaster;
import com.example.cheng.GreenDao.DaoSession;
import com.example.cheng.GreenDao.MySQLiteOpenHelper;
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
    private MySQLiteOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    public static App instances;

    @Override
    public void onCreate() {
        super.onCreate();
        instances=this;
        initoptions();
        Bugly.init(this, "f9a9490b27", true);
        initOkgo();
        initLogo();
        setDatabase();
    }

    private void setDatabase() {

        mHelper = new MySQLiteOpenHelper(this, "notes-db");
        db = mHelper.getWritableDatabase();
        // 注意：该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();

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

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
    public SQLiteDatabase getDb() {
        return db;
    }

    public static App getInstances(){
        return instances;
    }

}
