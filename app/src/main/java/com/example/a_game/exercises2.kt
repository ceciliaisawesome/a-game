package com.example.a_game

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class exercises2 : AppCompatActivity() {
    lateinit var buttonstart: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises2)
        buttonstart=findViewById(R.id.starttimer)

        buttonstart.setOnClickListener {
            val intent= Intent(this, Countdown2::class.java)
            startActivity(intent)
        }

    }
}