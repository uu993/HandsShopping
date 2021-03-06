package com.shoping.hands.fragment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shoping.hands.R;
import com.shoping.hands.result.BoutiqueListResult;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by mingge on 2016/11/22.
 */

public class BoutiqueListAdapter extends BaseAdapter {
    private Context context;
    private List<BoutiqueListResult> videoList = new ArrayList<>();

    public BoutiqueListAdapter(Context context) {
        super();
        this.context = context;
    }

    public void updateData(List<BoutiqueListResult> videoList) {
        if (videoList != null) {
            this.videoList = videoList;
        }
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
//        return videoList.size();
        return 35;
    }

    @Override
    public Object getItem(int position) {
        return videoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.fragment_boutique_listview_item, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }

    class ViewHolder {
        @Bind(R.id.img)
        ImageView img;
        @Bind(R.id.tao_icon)
        ImageView taoIcon;
        @Bind(R.id.title)
        TextView title;
        @Bind(R.id.coupon_text)
        TextView couponText;
        @Bind(R.id.coupon_num)
        TextView couponNum;
        @Bind(R.id.coupon_after_tip)
        TextView couponAfterTip;
        @Bind(R.id.coupon_now_price_text)
        TextView couponNowPriceText;
        @Bind(R.id.coupon_original_price_text)
        TextView couponOriginalPriceText;
        @Bind(R.id.buy_now)
        TextView buyNow;
        @Bind(R.id.num_remains)
        TextView numRemains;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
