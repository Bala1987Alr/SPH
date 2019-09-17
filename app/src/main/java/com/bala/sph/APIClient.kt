package com.bala.sph

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

public class APIClient {

    private var BASE_URL  = "https://data.gov.sg/api/action/"
    private lateinit var retrofit : Retrofit
    public val APIKEY : String = "a807b7ab-6cad-4aa6-87d0-e283a7353a0f"

    fun getClient() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()


}

public interface APIService
{
    @GET("datastore_search")
    fun getData(@Query("resource_id") resource_id: String, @Query("limit") limit : Int) : Call<Resources>
}