package com.example.a_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class weightpage : AppCompatActivity() {
    lateinit var btnokay:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weightpage)
        btnokay=findViewById(R.id.button2)

        btnokay.setOnClickListener {
            val intent= Intent(this, exercises::class.java)
            startActivity(intent)
        }
    }
}