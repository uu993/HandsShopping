package com.shoping.hands.base;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mingge on 2016/11/7.
 */

public class BaseFragment extends Fragment {
    protected View view;
    Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mContext=getActivity();
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
