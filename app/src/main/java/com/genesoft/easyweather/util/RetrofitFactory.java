package com.genesoft.easyweather.util;


import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.net.sip.SipErrorCode.TIME_OUT;

public class RetrofitFactory {

    private static final String BASE_URL = "https://way.jd.com/he/";

    private volatile static RetrofitFactory mRetrofitFactory = null;

    private RetrofitService mRetrofitService;

    private RetrofitFactory() {
        initRetrofit();
    }

    public static RetrofitFactory getInstance() {
        if (mRetrofitFactory == null) {
            synchronized (RetrofitFactory.class) {
                if (mRetrofitFactory == null) {
                    mRetrofitFactory = new RetrofitFactory();
                }
            }
        }
        return mRetrofitFactory;
    }

    public RetrofitService getRetrofit() {
        return mRetrofitService;
    }

    private void initRetrofit() {
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        //TODO
                        Request mRequest = chain.request();
                        return chain.proceed(mRequest);
                    }
                })
                .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                    @Override
                    public void log(String message) {
                        Log.i("HttpLog", message);
                    }
                }).setLevel(HttpLoggingInterceptor.Level.BASIC))
                .build();

        Retrofit mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();

        mRetrofitService = mRetrofit.create(RetrofitService.class);
    }
}
