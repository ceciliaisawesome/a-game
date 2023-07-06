package com.example.a_game

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Loginpage : AppCompatActivity() {
    lateinit var btnlogin:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        btnlogin=findViewById(R.id.button)

        btnlogin.setOnClickListener {
            val intent=Intent(this, weightpage::class.java)
            startActivity(intent)
        }

    }
}