package com.shoping.hands.protocol.manager;

import com.shoping.hands.protocol.service.UserService;
import com.shoping.hands.result.GoodsLinkResult;

import retrofit2.Callback;

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

    public UserService getUserService() {
        return userService;
    }

    public void getGoodLink(Callback<GoodsLinkResult> callback) {
        getUserService().goodsLink(callback);
    }
}
