package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hellobtn = findViewById<Button>(R.id.hellobutton)

        hellobtn.setOnClickListener{
            Log.v("Hello", "Clicked")
            Toast.makeText(this, getString(R.string.toast_message), Toast.LENGTH_SHORT).show()
        }
    }
}