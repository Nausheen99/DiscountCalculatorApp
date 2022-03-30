package com.example.t1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        res.visibility = View.INVISIBLE
        calButton.setOnClickListener(){
            val amount = amount.text.toString().toDouble()
            val discount = 1-discount.text.toString().toDouble()/100
            var total = amount * discount
            res.visibility = View.VISIBLE
            res.text = "Total amount is $total pkr"
        }
    }
}