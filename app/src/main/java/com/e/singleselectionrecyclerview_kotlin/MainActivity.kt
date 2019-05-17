package com.e.singleselectionrecyclerview_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var myData: ArrayList<MyData> = ArrayList<MyData>()
    private var recyclerAdapter: RecyclerAdpter? = null
    val name = arrayOf(
        "Alex Merchant",
        "Pexa Gaur",
        "Mariya Nuu",
        "Sharry Quark",
        "Fexto Noma",
        "Irrish Crush",
        "John N",
        "Robert King",
        "Mr. King",
        "Johnny Bin",
        "Bella Nii",
        "Nexa Maarico",
        "Barcoleen",
        "Alex Merchant",
        "Pexa Gaur",
        "Mariya Nuu",
        "Sharry Quark",
        "Fexto Noma",
        "Irrish Crush",
        "John N",
        "Robert King",
        "Mr. King",
        "Johnny Bin",
        "Bella Nii",
        "Nexa Maarico",
        "Barcoleen"
    )

    val address = arrayOf(
        "London Streets",
        "India",
        "Austraila",
        "Belgium",
        "Dubai",
        "New York",
        "London Streets",
        "India",
        "Austraila",
        "Belgium",
        "Dubai",
        "New York",
        "New York",
        "London Streets",
        "India",
        "Austraila",
        "Belgium",
        "Dubai",
        "New York",
        "London Streets",
        "India",
        "Austraila",
        "Belgium",
        "Dubai",
        "New York",
        "New York"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rv_recycler.layoutManager = LinearLayoutManager(this)
        recyclerAdapter = RecyclerAdpter(this, myData)
        rv_recycler.adapter = recyclerAdapter
        makeList()
    }


    fun makeList() {
        for (item in name.indices) {
          var mydata= MyData(name[item],address[item])
            myData.add(mydata)
        }
        recyclerAdapter!!.notifyDataSetChanged()
    }
}
