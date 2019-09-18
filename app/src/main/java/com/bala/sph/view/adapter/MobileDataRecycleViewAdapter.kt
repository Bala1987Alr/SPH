package com.bala.sph.view.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bala.sph.R
import com.bala.sph.models.Records
import com.bala.sph.models.Resources
import kotlinx.android.synthetic.main.mobile_data_usage_cell.view.*

class MobileDataRecycleViewAdapter(val context : Context,val records: List<Records>) : RecyclerView.Adapter<DataViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DataViewHolder {

        return DataViewHolder(LayoutInflater.from(context).inflate(R.layout.mobile_data_usage_cell,p0,false))
    }

    override fun getItemCount(): Int {

        return records.size
    }

    override fun onBindViewHolder(dataViewHolder: DataViewHolder, position: Int) {

        dataViewHolder.view_holder_item1.text = records.get(position).volume_of_mobile_data
        dataViewHolder.view_holder_item2.text = records.get(position).quarter
    }


}

class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
{
    val view_holder_item1 = itemView.textView5
    val view_holder_item2 = itemView.textView6
}