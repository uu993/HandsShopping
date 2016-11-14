package com.shoping.hands.protocol.service;

import com.shoping.hands.result.GoodsLinkResult;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by mingge on 2016/11/14.
 */

public interface UserService {
    @GET("/api/classCageList")
    void goodsLink(Callback<GoodsLinkResult> cb);
}
