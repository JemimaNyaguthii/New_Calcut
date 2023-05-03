package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sumNumbers()
        subNumbers()
        multiplyNumbers()
        divideNumbers()
    }
    fun sumNumbers(){
        var num1= findViewById<EditText>(R.id.etNumber1)
        var num2=findViewById<EditText>(R.id.etNumber2)
        var button=findViewById<Button>(R.id.btnAdd)

        button.setOnClickListener {
            var click = num1.text.toString().toInt()
            var click2 =num2.text.toString().toInt()
            var clickResult = click+ click2

            Toast.makeText(this, "$clickResult", Toast.LENGTH_LONG).show()
        }

    }
    fun subNumbers(){
        var num1= findViewById<EditText>(R.id.etNumber1)
        var num2=findViewById<EditText>(R.id.etNumber2)
        var button=findViewById<Button>(R.id.btnSub)

        button.setOnClickListener {
            var click = num1.text.toString().toInt()
            var click2 =num2.text.toString().toInt()
            var clickResult = click - click2

            Toast.makeText(this, "$clickResult", Toast.LENGTH_LONG).show()
        }
         }
    fun multiplyNumbers() {
        var num1 = findViewById<EditText>(R.id.etNumber1)
        var num2 = findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnMultiply)

        button.setOnClickListener {
            var click = num1.text.toString().toInt()
            var click2 = num2.text.toString().toInt()
            var clickResult = click * click2

            Toast.makeText(this, "$clickResult", Toast.LENGTH_LONG).show()
        }
    }
    fun divideNumbers() {
        var num1 = findViewById<EditText>(R.id.etNumber1)
        var num2 = findViewById<EditText>(R.id.etNumber2)
        var button = findViewById<Button>(R.id.btnDivide)

        button.setOnClickListener {
            var click = num1.text.toString().toInt()
            var click2 = num2.text.toString().toInt()
            var clickResult = click / click2

            Toast.makeText(this, "$clickResult", Toast.LENGTH_LONG).show()
        }
    }
}