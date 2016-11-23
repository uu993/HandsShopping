package com.shoping.hands.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.shoping.hands.R;
import com.shoping.hands.activity.WebViewActivity;
import com.shoping.hands.base.BaseFragment;
import com.shoping.hands.view.SubListView;
import com.snail.pulltorefresh.PullToRefreshBase;
import com.snail.pulltorefresh.PullToRefreshScrollView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mingge on 2016/11/8.
 */

public class HomeFragment extends BaseFragment implements PullToRefreshBase.OnRefreshListener2 {
    @Bind(R.id.my_layout)
    RelativeLayout myLayout;
    @Bind(R.id.home_viewpager)
    ViewPager homeViewpager;
    @Bind(R.id.all_layout)
    LinearLayout allLayout;
    @Bind(R.id.food_layout)
    LinearLayout foodLayout;
    @Bind(R.id.famliy_layout)
    LinearLayout famliyLayout;
    @Bind(R.id.baby_layout)
    LinearLayout babyLayout;
    @Bind(R.id.cosmetics_layout)
    LinearLayout cosmeticsLayout;
    @Bind(R.id.limited_spike_title)
    TextView limitedSpikeTitle;
    @Bind(R.id.limited_spike_text)
    TextView limitedSpikeText;
    @Bind(R.id.limited_spike_icon)
    ImageView limitedSpikeIcon;
    @Bind(R.id.limited_spike_layout)
    LinearLayout limitedSpikeLayout;
    @Bind(R.id.brand_sale_title)
    TextView brandSaleTitle;
    @Bind(R.id.brand_sale_text)
    TextView brandSaleText;
    @Bind(R.id.cabbage_party_title)
    TextView cabbagePartyTitle;
    @Bind(R.id.cabbage_party_text)
    TextView cabbagePartyText;
    @Bind(R.id.cabbage_party_layout)
    RelativeLayout cabbagePartyLayout;
    @Bind(R.id.brand_sale_layout)
    LinearLayout brandSaleLayout;
    @Bind(R.id.update_time_text)
    TextView updateTimeText;
    @Bind(R.id.home_listview)
    SubListView homeListview;
    @Bind(R.id.home_scrollview)
    PullToRefreshScrollView homeScrollview;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        homeScrollview.setOnRefreshListener(this);
        homeScrollview.setMode(PullToRefreshBase.Mode.BOTH);
    }

    @OnClick({R.id.my_layout, R.id.all_layout, R.id.food_layout, R.id.famliy_layout, R.id.baby_layout
            , R.id.cosmetics_layout, R.id.limited_spike_layout, R.id.cabbage_party_layout
            , R.id.brand_sale_layout})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_layout:
                break;
            case R.id.all_layout:
                startActivity(new Intent(getActivity(), WebViewActivity.class));
                break;
            case R.id.food_layout:
                break;
            case R.id.famliy_layout:
                break;
            case R.id.baby_layout:
                break;
            case R.id.cosmetics_layout:
                break;
            case R.id.limited_spike_layout:
                break;
            case R.id.cabbage_party_layout:
                break;
            case R.id.brand_sale_layout:
                break;
        }
    }

    @Override
    public void onPullDownToRefresh(PullToRefreshBase refreshView) {

    }

    @Override
    public void onPullUpToRefresh(PullToRefreshBase refreshView) {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
