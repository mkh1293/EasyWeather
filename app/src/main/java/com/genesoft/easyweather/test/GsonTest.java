package com.genesoft.easyweather.test;

import android.util.Log;

import com.genesoft.easyweather.model.WeatherBean;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2017/10/31.
 */

public class GsonTest {

    private Response mResponse = null;

    private OkHttpClient client = new OkHttpClient();

    private Request mRequest =new Request
            .Builder()
            .url("https://way.jd.com/he/freeweather?city=beijing&appkey=5d0ef9815bab88eb4c790460b7e98065")
            .build();

    public void runTest(){
        new Thread(new MyThread()).start();
    }

    private class MyThread implements Runnable{
        @Override
        public void run() {
            try{
                mResponse = client.newCall(mRequest).execute();
                if (null != mResponse && mResponse.isSuccessful()){
                    Log.i("httptest", mResponse.body().string());
                }
                else
                    Log.i("httptest", "No Response!'");
            }
            catch (Exception e){
                Log.i("httptest", e.toString());
            }
        }
    }

    public Response getResponse(){
        return mResponse;
    }
}
