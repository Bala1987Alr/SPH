package com.bala.sph.models

import com.google.gson.annotations.SerializedName

class Resources
{

    @SerializedName("success")
    var success : String = ""
    @SerializedName("result")
    lateinit var result : Result

}
class Result
{
    @SerializedName("records")
    lateinit var records: List<Records>
}

 class Records
{
    @SerializedName("volume_of_mobile_data")
    lateinit var volume_of_mobile_data : String

    @SerializedName("quarter")
    lateinit var quarter: String

    @SerializedName("_id")
    var _id : Int = 0

}