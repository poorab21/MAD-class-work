package com.mad.myapplication

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class myAdapter(context : Context, val list_data : ArrayList<String>) : ArrayAdapter<String>(context,
    R.layout.list_item,list_data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        var view : View = inflater.inflate(R.layout.list_item,null)

        var name : TextView = view.findViewById<TextView>(R.id.name)
        name.text = list_data[position]

        return view;
    }

}