package com.bala.sph

import com.google.gson.annotations.SerializedName

public class Resources
{

    @SerializedName("success")
    private lateinit var success : String
    @SerializedName("result")
    lateinit var result : Result

}
public class Result
{
    @SerializedName("records")
    private lateinit var records: List<Records>
}

public class Records
{
    @SerializedName("volume_of_mobile_data")
    private lateinit var volume_of_mobile_data : String

    @SerializedName("quarter")
    private lateinit var quarter: String

    @SerializedName("_id")
    private  var _id : Int = 0

}