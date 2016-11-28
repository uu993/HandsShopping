package com.shoping.hands.protocol.service;

import com.shoping.hands.result.ArticleResult;
import com.shoping.hands.result.GoodsLinkResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mingge on 2016/11/14.
 */

public interface UserService {
    /**
     * 首页接口
     *
     * @param type   www_quan (网站专用、仅加入推广的商品)
     * @param appkey 大淘客appkey
     * @param v      (否)  2: utf-8编码的json格式数据
     *               1(默认值): 返回gbk编码json格式数据（此参数主要为了兼容之前的数据,后续将逐步取消,建议使用2）
     * @return
     */
    @GET("index.php?r=goodsLink/ios")
    Call<GoodsLinkResult> goodsLink(
            @Query("type") String type,
            @Query("appkey") String appkey,
            @Query("v") String v
    );

    /**
     * 测试
     *
     * @return
     */
    @GET("http://c.m.163.com/nc/article/headline/T1348647909107/0-20.html")
    Call<ArticleResult> getArticle();
}
