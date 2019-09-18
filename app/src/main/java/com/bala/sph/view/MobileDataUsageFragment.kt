package com.bala.sph.view


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bala.sph.R
import com.bala.sph.contract.MobileDataUsageContractor
import com.bala.sph.models.Resources
import com.bala.sph.presenter.MobileDataUsagePresenter
import com.bala.sph.view.adapter.MobileDataRecycleViewAdapter
import kotlinx.android.synthetic.main.fragment_mobile_data_usage.*


class MobileDataUsageFragment : Fragment(), MobileDataUsageContractor.DataUsageView {

    private val TAG = "MobileDataUsageFragment"
    private lateinit var recyclerView: RecyclerView
    private lateinit var presenter : MobileDataUsagePresenter
    private lateinit var adapter : MobileDataRecycleViewAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        presenter = MobileDataUsagePresenter(this)
        presenter.getMobileDataUsage(25)

        return inflater.inflate(R.layout.fragment_mobile_data_usage, container, false)
    }

    override fun onResponseSuccess(data: Resources)
    {
        Log.d(TAG,data.result.records.toString())

        adapter = MobileDataRecycleViewAdapter(requireContext(),records = data.result.records)

        mobile_data_cycle.layoutManager = LinearLayoutManager(requireContext())
        mobile_data_cycle.adapter = adapter


    }

    override fun onResponseFailure(throwable: Throwable) {

        Log.d(TAG,throwable.message)

    }


    override fun showProgressBar()
    {

    }

    override fun hideProgressBar()
    {

    }

    override fun onDestroy() {
        super.onDestroy()

    }



}
