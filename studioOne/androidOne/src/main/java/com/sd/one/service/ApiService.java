package com.sd.one.service;

import com.sd.one.model.base.BaseResponse;
import com.sd.one.model.response.ConfigData;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * [retrofit实现接口部分；
 * 本框架接口都返回call，因为call同时支持同步和异步方法，在异步框架里面用同步方法(比如activity页面发请求)，不在异步框架里面用异步方法(比如dialog里面发请求)
 * retrofit具体使用可参见官网http://square.github.io/retrofit/]
 *
 * @author huxinwu
 * @version 1.0
 * @date 2016/10/11
 */
public interface ApiService {

    //为什么返回call，因为call支持同步和异步方法，在
    @GET("/app/sys/getConfig")
    Call<BaseResponse<List<ConfigData>>> getConfig();


    @GET("/app/circle/getCircleTypeList")
    Call<BaseResponse<List<ConfigData>>> getCircleTypeList(@Query("patientId") String patientId);
}
