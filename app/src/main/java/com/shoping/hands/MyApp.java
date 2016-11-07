package com.shoping.hands;

import android.app.Application;
import android.content.Context;

/**
 * Created by tianxiaopeng on 15-1-7.
 */
public class MyApp extends Application {
    private static Context mAppContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = this;

    }

    public static Context getAppContext() {
        return mAppContext;
    }
}
