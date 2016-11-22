package com.shoping.hands.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mingge on 2016/11/8.
 */

public class SearchFragment extends BaseFragment {
    @Bind(R.id.hot_recyclerview)
    RecyclerView hotRecyclerview;
    @Bind(R.id.history_list)
    ListView historyList;
    @Bind(R.id.clear_history)
    Button clearHistory;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.clear_history})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.clear_history:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
