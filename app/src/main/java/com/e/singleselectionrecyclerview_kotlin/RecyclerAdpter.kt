package com.e.singleselectionrecyclerview_kotlin

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recycler_item.view.*

class RecyclerAdpter(private var context: Context?, private var myData: ArrayList<MyData>) :
    RecyclerView.Adapter<RecyclerAdpter.MyViewHolder>() {
    private var selected: Int = -1

    class MyViewHolder(val layout: ConstraintLayout) : RecyclerView.ViewHolder(layout)

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerAdpter.MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false) as ConstraintLayout
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return myData.size
    }

    override fun onBindViewHolder(holder: RecyclerAdpter.MyViewHolder, position: Int) {

//        holder.layout.cd_selected.isEnabled= false

        if (selected == position) {
            holder.layout.cd_selected.isChecked= true
        } else {
            holder.layout.cd_selected.isChecked = false
        }

        holder.layout.tv_name.text = myData[position].name
        holder.layout.tv_address.text = myData[position].address
        holder.layout.cd_selected.setOnClickListener {
            selected = position
            holder.layout.cd_selected.isChecked= true
            notifyDataSetChanged()
        }
    }
}