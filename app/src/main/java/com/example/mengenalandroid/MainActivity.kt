package com.example.mengenalandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tombol(view: View) {
        val intent = Intent(this, Tugas2::class.java)
        startActivity(intent)
    }

    fun tombol2(view: View){
        val intent = Intent(this, Tugas3::class.java)
        startActivity(intent)
    }

}