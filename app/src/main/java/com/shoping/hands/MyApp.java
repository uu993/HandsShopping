package com.shoping.hands;

import android.app.Application;
import android.content.Context;

import com.tencent.smtt.sdk.QbSdk;

/**
 * Created by tianxiaopeng on 15-1-7.
 */
public class MyApp extends Application {
    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = this;
        QbSdk.initX5Environment(getApplicationContext(), null);//调用 QbSdk 的预加载接口 ,当 App 后续创建 webview 时就可以首次加载 x5 内核了
    }

    public static Context getAppContext() {
        return mAppContext;
    }
}
