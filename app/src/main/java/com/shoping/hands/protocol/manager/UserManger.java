package com.shoping.hands.protocol.manager;

import com.shoping.hands.protocol.service.UserService;
import com.shoping.hands.result.ArticleResult;
import com.shoping.hands.result.GoodsLinkResult;

import retrofit2.Call;

/**
 * Created by mingge on 2016/11/14.
 */

public class UserManger {
    private static UserManger instance;
    private UserService userService;

    private UserManger() {
        userService = RestManager.getInstance().create(UserService.class);
    }

    public static UserManger getInstance() {
        if (instance == null) {
            instance = new UserManger();
        }
        return instance;
    }

    private UserService getUserService() {
        return userService;
    }

    public Call<GoodsLinkResult> getGoodLink() {
        return getUserService().goodsLink("ios_quan", "021hjz3v3k", "2");
    }

    public Call<ArticleResult> getArticle() {
        return getUserService().getArticle();
    }
}
