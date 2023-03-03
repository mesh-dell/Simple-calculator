package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

lateinit var add : Button
lateinit var power : Button
lateinit var subtract : Button
lateinit var divide : Button
lateinit var multiply : Button
lateinit var modulus : Button
lateinit var num1 : EditText
lateinit var num2 : EditText
lateinit var tvResult : TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add = findViewById(R.id.add)
        power = findViewById(R.id.power)
        subtract = findViewById(R.id.subtract)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        modulus = findViewById(R.id.modulus)
        num1 = findViewById(R.id.etNum1)
        num2 = findViewById(R.id.etNum2)
        tvResult = findViewById<TextView>(R.id.tvResult)
        //listeners
        add.setOnClickListener {
            if(num1.text.isEmpty() || num2.text.isEmpty())
            {
                return@setOnClickListener
            }
            var a = num1.text.toString().toDouble()
            var b = num1.text.toString().toDouble()
            var sum = a+b
            tvResult.text = sum.toString()
            sum = 0.0
        }
    }
}