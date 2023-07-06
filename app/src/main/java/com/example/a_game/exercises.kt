package com.example.a_game

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class exercises : AppCompatActivity() {
    lateinit var btndone:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises)
        btndone=findViewById(R.id.btn_done)


        btndone.setOnClickListener {
            val intent = Intent(this, exercises2::class.java)
            startActivity(intent)
        }




        }
    }
