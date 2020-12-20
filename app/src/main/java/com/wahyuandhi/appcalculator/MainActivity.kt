package com.wahyuandhi.appcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private var prev_num: Int = 0
    private lateinit var operator: String
    private var num: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAddition)
        val btnSub = findViewById<Button>(R.id.btnSubtraction)
        val btnMulti = findViewById<Button>(R.id.btnMultiplication)
        val btnDiv = findViewById<Button>(R.id.btnDivision)
        val btnEquals = findViewById<Button>(R.id.btnEquals)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val etNum = findViewById<EditText>(R.id.etNumber)

        btnAdd.setOnClickListener {
            if (etNum.text.toString() != "") {
                val et: String = etNum.text.toString()
                prev_num = et.toInt()
                operator = "+"
                etNum.setText("")
            }
        }

        btnSub.setOnClickListener {
            if (etNum.text.toString() != "") {
                val et: String = etNum.text.toString()
                prev_num = et.toInt()
                operator = "-"
                etNum.setText("")
            }
        }

        btnMulti.setOnClickListener {
            if (etNum.text.toString() != "") {
                val et: String = etNum.text.toString()
                prev_num = et.toInt()
                operator = "*"
                etNum.setText("")
            }
        }

        btnDiv.setOnClickListener {
            if (etNum.text.toString() != "") {
                val et: String = etNum.text.toString()
                prev_num = et.toInt()
                operator = "/"
                etNum.setText("")
            }
        }

        btnEquals.setOnClickListener {
            if (etNum.text.toString() != "") {
                val et: String = etNum.text.toString()
                when (operator) {
                    "+" -> num = prev_num + et.toInt()
                    "-" -> num = prev_num - et.toInt()
                    "*" -> num = prev_num * et.toInt()
                    "/" -> num = prev_num / et.toInt()
                    else -> reset()
                }
                etNum.setText(num.toString())
            }
        }

        btnReset.setOnClickListener {
            reset()
            etNum.setText("")
        }
    }

    fun reset() {
        prev_num = 0
        operator = ""
        num = 0
    }
}