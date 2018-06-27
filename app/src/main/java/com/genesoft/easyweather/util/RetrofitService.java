package com.genesoft.easyweather.util;


import com.genesoft.easyweather.model.WeatherBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {

    @GET("freeweather")
    Observable<WeatherBean> getWeather(@Query("city") String city, @Query("appkey") String appKey);
}
