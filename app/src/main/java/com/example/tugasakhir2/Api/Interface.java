package com.example.tugasakhir2.Api;

import com.example.tugasakhir2.Model.RekomendasiLaptop;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.HTTP;
import retrofit2.http.POST;

public interface Interface {
    @FormUrlEncoded
    @POST("filterlaptop")
    Call<RekomendasiLaptop> postRekomendasi(@Field("company") String company,
                                            @Field("product") String product,
                                            @Field("typename") String typename,
                                            @Field("inches") String inches,
                                            @Field("screenresolution") String screenresolution,
                                            @Field("cpu") String cpu,
                                            @Field("ram") String ram,
                                            @Field("memory") String memory,
                                            @Field("gpu") String gpu,
                                            @Field("opsis") String opsis,
                                            @Field("weight") String weight);
}
