package com.shoping.hands.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseFragment;

/**
 * Created by mingge on 2016/11/8.
 */

public class SearchFragment extends BaseFragment {
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;
    }
}
