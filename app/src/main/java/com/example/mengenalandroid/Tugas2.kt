package com.example.mengenalandroid

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tugas2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tugas2)
    }
    private var num1=0
    private var num2=0
    private var mult1=0
    private var mult2=0
    private var total=0
    private var hasil1="0"
    private var hasil2="0"
    private var diskon = 0
    fun hitung(view: View) {
        num1 = findViewById<TextView>(R.id.harga1).getText().toString().toInt()
        num2=findViewById<TextView>(R.id.harga2).getText().toString().toInt()
        mult1=findViewById<TextView>(R.id.jumlah1).getText().toString().toInt()
        mult2=findViewById<TextView>(R.id.jumlah2).getText().toString().toInt()
        total = num1*mult1+num2*mult2
        diskon = total*15/100
        total = total-diskon
        this.hasil1 = diskon.toString()
        this.hasil2 = total.toString()
        val viewtotal: TextView = findViewById<TextView>(R.id.total)
        val viewdiskon: TextView = findViewById<TextView>(R.id.diskon)
        viewtotal.text = hasil1
        viewdiskon.text = hasil2
    }


}