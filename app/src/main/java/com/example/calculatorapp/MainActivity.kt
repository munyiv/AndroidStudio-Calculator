package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etNumber1=findViewById<EditText>(R.id.etNumber1)
        var etNumber2=findViewById<EditText>(R.id.etNumber2)
        var answer=findViewById<TextView>(R.id.tvAnswer)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnSubtract=findViewById<Button>(R.id.btnSubtract)
        var btnModulus=findViewById<Button>(R.id.btnModulus)
        var btnMultiply=findViewById<Button>(R.id.btnMultiply)

        btnAdd.setOnClickListener {

            if (etNumber1.text.toString() == "") {

                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()

            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var num1 = etNumber1.text.toString().toInt()
                var num2 = etNumber2.text.toString().toInt()

                var addResult = num1 + num2
                answer.text = "Answer: ${addResult}"

            }
        }
        btnSubtract.setOnClickListener {

            if (etNumber1.text.toString() == "") {

                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()

            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var num1 = etNumber1.text.toString().toInt()
                var num2 = etNumber2.text.toString().toInt()

                var subtractResult = num1 - num2
                answer.text = "Answer: ${subtractResult}"

            }
        }


        btnModulus.setOnClickListener {
            if (etNumber1.text.toString() == "") {

                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()

            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var num1 = etNumber1.text.toString().toInt()
                var num2 = etNumber2.text.toString().toInt()

                var modulusResult = num1 % num2
                answer.text = "Answer: ${modulusResult}"

            }
        }

        btnMultiply.setOnClickListener {

            if (etNumber1.text.toString() == "") {

                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()

            } else if (etNumber2.text.toString() == "") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_SHORT).show()
            } else {
                var num1 = etNumber1.text.toString().toInt()
                var num2 = etNumber2.text.toString().toInt()

                var multiplyResult = num1 * num2
                answer.text = "Answer: ${multiplyResult}"

            }
        }

    }
    
}



