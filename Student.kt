package com.mad.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Student : AppCompatActivity() {
    private lateinit var name : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        name = findViewById<TextView>(R.id.student_name) as TextView
        name.text = intent.getStringExtra("name")
    }
}