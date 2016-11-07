package com.shoping.hands.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseActivity;

/**
 * 启动页
 */
public class SplashActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    public void initView() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
        }, 1500);
    }
}
