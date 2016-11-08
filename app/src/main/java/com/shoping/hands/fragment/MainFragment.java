package com.shoping.hands.fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mingge on 2016/11/7.
 */

public class MainFragment extends BaseFragment {

    @Bind(R.id.item_one)
    ImageButton itemOne;
    @Bind(R.id.item_two)
    ImageButton itemTwo;
    @Bind(R.id.item_three)
    ImageButton itemThree;

    public MainFragment() {
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    private HomeFragment homeFragment;
    private BoutiqueFragment boutiqueFragment;
    private SearchFragment searchFragment;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        addChildFragment();
        return view;
    }

    private void addChildFragment() {
        homeFragment = new HomeFragment();
        boutiqueFragment = new BoutiqueFragment();
        searchFragment = new SearchFragment();
        changeFragment(homeFragment, boutiqueFragment, searchFragment);
        changeBottomImg(true, false, false);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick({R.id.item_one, R.id.item_two, R.id.item_three})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.item_one:
                changeFragment(homeFragment, boutiqueFragment, searchFragment);
                changeBottomImg(true, false, false);
                break;
            case R.id.item_two:
                changeFragment(boutiqueFragment, homeFragment, searchFragment);
                changeBottomImg(false, true, false);
                break;
            case R.id.item_three:
                changeFragment(searchFragment, boutiqueFragment, homeFragment);
                changeBottomImg(false, false, true);
                break;
        }
    }

    private void changeBottomImg(boolean homeSelected, boolean boutiqueSelected, boolean searchSelected) {
        itemOne.setSelected(homeSelected);
        itemTwo.setSelected(boutiqueSelected);
        itemThree.setSelected(searchSelected);
    }

    private void changeFragment(Fragment targetFragment, Fragment... fragments) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        if (!targetFragment.isAdded()) {
            transaction.add(R.id.main_container, targetFragment, targetFragment.getClass().getName());
        }
        transaction.show(targetFragment);
        for (int i = 0; i < fragments.length; i++) {
            transaction.hide(fragments[i]);
        }
        transaction.commitAllowingStateLoss();
    }

}
