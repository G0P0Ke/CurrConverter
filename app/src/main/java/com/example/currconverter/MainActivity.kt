package com.example.currconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageButton.setOnClickListener{
            var cur1: String = Currency1.getText().toString()
            var cur2: String = Currency2.getText().toString()
            Currency1.setText(cur2)
            Currency2.setText(cur1)
        }
        convert.setOnClickListener {
            val cur1: String = Currency1.getText().toString()
            var sum: Float = money1.getText().toString().toFloat()
            if (cur1 == "Рубль"){
                money2.setText("${sum/74} $")
            }else if(cur1 == "Доллар"){
                money2.setText("${sum*74} Руб")
            }
        }
    }
}
