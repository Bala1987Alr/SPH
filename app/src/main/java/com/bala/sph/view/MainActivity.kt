package com.bala.sph.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bala.sph.networking.APIClient
import com.bala.sph.networking.APIService
import com.bala.sph.R
import com.bala.sph.models.Resources
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
