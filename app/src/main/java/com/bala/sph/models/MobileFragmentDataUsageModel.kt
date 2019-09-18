package com.bala.sph.models

import android.util.Log
import com.bala.sph.contract.MobileDataUsageContractor
import com.bala.sph.networking.APIClient
import com.bala.sph.networking.APIService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MobileFragmentDataUsageModel : MobileDataUsageContractor.DataUsageModel {

    private val TAG = "FragmentDataUsageModel"
    lateinit var retrofit: Retrofit
    lateinit var apiClient: APIClient
    lateinit var apiService: APIService

    override fun getMobileDataUsage(onFinishedListener: MobileDataUsageContractor.DataUsageModel.OnFinishedListener,limit: Int)  {

        apiClient = APIClient()
        retrofit = apiClient.getClient()
        apiService = retrofit.create(APIService::class.java)


        val call = apiService.getData(apiClient.APIKEY,limit)
        call.enqueue(object : Callback<Resources>
        {
            override fun onFailure(call: Call<Resources>, t: Throwable) {

                onFinishedListener.onFailure(t)

            }

            override fun onResponse(call: Call<Resources>, response: Response<Resources>) {

                onFinishedListener.onFinished(response.body()!!)
                Log.d(TAG,response.code().toString())
            }

        })


    }
}