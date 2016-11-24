package com.shoping.hands.activity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseActivity;
import com.shoping.hands.fragment.MainFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 主activity
 */
public class MainActivity extends BaseActivity {
    @Bind(R.id.container)
    FrameLayout container;
    private MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainFragment = new MainFragment();
        if (savedInstanceState == null) {
            mainFragment = MainFragment.newInstance();
            getFragmentManager().beginTransaction().add(R.id.container, mainFragment).commitAllowingStateLoss();
        }
    }

    @Override
    public void initView() {
    }
}
