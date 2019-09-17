package com.bala.sph

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    lateinit var retrofit: Retrofit
    lateinit var apiClient: APIClient
    lateinit var apiService: APIService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiClient = APIClient()
        retrofit = apiClient.getClient()
        apiService = retrofit.create(APIService::class.java)

        val call = apiService.getData(apiClient.APIKEY,25)
        call.enqueue(object : Callback<Resources>
        {
            override fun onFailure(call: Call<Resources>, t: Throwable) {

            }

            override fun onResponse(call: Call<Resources>, response: Response<Resources>) {

                Log.d(TAG,response.message())
            }

        });




    }
}
