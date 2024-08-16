package com.shantnu.myfirstandroidapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDownload = findViewById<Button>(R.id.buttonDownload)
        val buttonUpload = findViewById<Button>(R.id.buttonUpload)

        buttonDownload.setOnClickListener{
            Toast.makeText(applicationContext, "Downloading...", Toast.LENGTH_SHORT).show()
        }

        buttonUpload.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading...", Toast.LENGTH_SHORT).show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}