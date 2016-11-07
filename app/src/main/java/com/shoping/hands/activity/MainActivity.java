package com.shoping.hands.activity;

import android.os.Bundle;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseActivity;

/**
 * 主activity
 */
public class MainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        setTitle("主页");
    }
}
