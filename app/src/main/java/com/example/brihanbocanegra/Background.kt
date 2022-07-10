package com.example.brihanbocanegra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Background : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)

        var text = findViewById<TextView>(R.id.boton)
        text.setOnClickListener{
        startActivity(Intent(this,MainActivity::class.java))

    }
    }

}