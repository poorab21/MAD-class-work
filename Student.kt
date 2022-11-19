package com.mad.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val bundle : Bundle = Bundle()
        bundle.putString(
            "name",
            intent.getStringExtra("name").toString()
        )

        val studentfragment = StudentFragment()
        studentfragment.arguments = bundle

        supportFragmentManager.beginTransaction().replace(R.id.stud_fragment,studentfragment).commit()
    }
}