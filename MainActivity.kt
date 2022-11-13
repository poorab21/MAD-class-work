package com.mad.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.mad.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding;
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

        findViewById<ListView>(R.id.list).adapter = myAdapter(this,list_data)
    }
}