package com.johnbosco.myprofi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val h = findViewById<Button>(R.id.hlo)
        h.setOnClickListener {
            val p = Intent(this, MainActivity::class.java)
            startActivity(p)
        }
    }
}