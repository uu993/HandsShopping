package com.shoping.hands.protocol.manager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shoping.hands.Constants;
import com.shoping.hands.MyApp;
import com.shoping.hands.manager.Logger;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mingge on 16-11-11.
 */
public class RestManager {
    private static RestManager s_instance;
    private Retrofit retrofit;

    private RestManager() {
        //开启Log
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                Logger.d(message);
            }
        });
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //缓存
        File cacheFile = new File(MyApp.getAppContext().getCacheDir(), "cache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb
        //增加头部信息
        Interceptor headerInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request build = chain.request().newBuilder()
                        .addHeader("Content-Type", "application/json")
                        .build();
                Logger.d(build.headers().toString());
                return chain.proceed(build);
            }
        };

        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(logInterceptor)
                .connectTimeout(5000, TimeUnit.SECONDS)
                .readTimeout(6000,TimeUnit.SECONDS)
                .addInterceptor(headerInterceptor)
                .cache(cache)
                .build();
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();//使用 gson coverter，统一日期请求格式

        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static RestManager getInstance() {
        if (s_instance == null) {
            s_instance = new RestManager();
        }

        return s_instance;
    }

    public <T> T create(Class<T> service) {
        return retrofit.create(service);
    }
}

