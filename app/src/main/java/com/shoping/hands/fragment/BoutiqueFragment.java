package com.shoping.hands.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shoping.hands.R;
import com.shoping.hands.base.BaseFragment;
import com.shoping.hands.fragment.adapter.BoutiqueListAdapter;
import com.snail.pulltorefresh.PullToRefreshBase;
import com.snail.pulltorefresh.PullToRefreshListView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by mingge on 2016/11/8.
 */

public class BoutiqueFragment extends BaseFragment implements PullToRefreshBase.OnRefreshListener2 {
    @Bind(R.id.boutique_listview)
    PullToRefreshListView listView;
    BoutiqueListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_boutique, container, false);
        ButterKnife.bind(this, view);
        initView();
        return view;
    }

    private void initView() {
        listView.setOnRefreshListener(this);
        listView.setMode(PullToRefreshBase.Mode.BOTH);
        listView.getRefreshableView().setDivider(null);
        adapter = new BoutiqueListAdapter(getActivity());
        listView.setAdapter(adapter);
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
