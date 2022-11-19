package com.mad.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView


class HomeFragment : Fragment() {

    private lateinit var list_data : ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        list_data = ArrayList()

        list_data.add("John")
        list_data.add("Rohan")
        list_data.add("Rohit")
        list_data.add("Sanjay")
        list_data.add("Rakesh")
        list_data.add("Chirag")
        list_data.add("Bruce")
        list_data.add("Perry")
        list_data.add("Joanne")
        list_data.add("Chris")

        var view : View = inflater.inflate(R.layout.fragment_home, container, false)
        val listview = view.findViewById<ListView>(R.id.listview) as ListView
        listview.adapter = myAdapter(inflater.context,list_data)

        listview.setOnItemClickListener{ parent,view,position,id ->
            val i = Intent(inflater.context,Student::class.java)
            i.putExtra("name",list_data[position])
            startActivity(i)
        }

        return view;
    }
}