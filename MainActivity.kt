package com.mad.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var list_data : ArrayList<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        list_data = ArrayList()

        list_data.add("John")
        list_data.add("Rohan")
        list_data.add("Bobby")
        list_data.add("Ruhan")
        list_data.add("Ajay")
        list_data.add("Brody")
        list_data.add("Andy")



        var listview = findViewById<ListView>(R.id.list) as ListView
        listview.adapter = myAdapter(this,list_data)

        listview.setOnItemClickListener{ parent, view, position, id ->
            val i = Intent(this,Student::class.java)
            i.putExtra("name",list_data[position])
            startActivity(i)
        }
    }
}