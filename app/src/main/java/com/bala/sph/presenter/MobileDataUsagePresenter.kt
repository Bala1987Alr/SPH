package com.bala.sph.presenter

import com.bala.sph.contract.MobileDataUsageContractor
import com.bala.sph.models.MobileFragmentDataUsageModel
import com.bala.sph.models.Resources

class MobileDataUsagePresenter(_view: MobileDataUsageContractor.DataUsageView): MobileDataUsageContractor.DataUsagePresenter,MobileDataUsageContractor.DataUsageModel.OnFinishedListener {


    private var dataUsageView : MobileDataUsageContractor.DataUsageView = _view
    private var dataUsageModel = MobileFragmentDataUsageModel()

    override fun onFinished(resources: Resources)
    {
        dataUsageView.onResponseSuccess(resources)
    }

    override fun onFailure(throwable: Throwable)
    {
        dataUsageView.onResponseFailure(throwable)

    }

    override fun getMobileDataUsage(limit: Int) {

        dataUsageModel.getMobileDataUsage(this,limit)


    }





}