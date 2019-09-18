package com.bala.sph.contract

import com.bala.sph.models.Resources

interface MobileDataUsageContractor {

    interface DataUsageView
    {
        fun onResponseSuccess(data: Resources)
        fun onResponseFailure(throwable : Throwable)
        fun showProgressBar()
        fun hideProgressBar()
    }

    interface DataUsagePresenter
    {

        fun getMobileDataUsage(limit : Int)
    }

    interface DataUsageModel
    {
        interface OnFinishedListener
        {
            fun onFinished(resources: Resources)
            fun onFailure(throwable : Throwable)
        }
        fun getMobileDataUsage(onFinishedListener: OnFinishedListener,limit: Int)
    }
}