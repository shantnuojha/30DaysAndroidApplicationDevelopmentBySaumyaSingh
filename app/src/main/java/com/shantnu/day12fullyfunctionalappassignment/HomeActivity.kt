package com.shantnu.day12fullyfunctionalappassignment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val btnAndroid = findViewById<Button>(R.id.btnAndroid)
        val btnIOS = findViewById<Button>(R.id.btnIOS)
        val btnML = findViewById<Button>(R.id.btnML)
        val btnAI = findViewById<Button>(R.id.btnAI)
        val btnDS = findViewById<Button>(R.id.btnDataScience)
        val btnWeb = findViewById<Button>(R.id.btnWebDevelopment)
        val btnCallUs = findViewById<Button>(R.id.btnCallUs)
        val btnBack = findViewById<Button>(R.id.btnBack)

        btnAndroid.setOnClickListener {
            val intent = Intent(applicationContext, AndroidAppDevelopmentActivity::class.java)
            startActivity(intent)
        }
        btnIOS.setOnClickListener {
            val intent = Intent(applicationContext, IOSAppDevelopmentActivity::class.java)
            startActivity(intent)
        }
        btnML.setOnClickListener {
            val intent = Intent(applicationContext, MLActivity::class.java)
            startActivity(intent)
        }
        btnAI.setOnClickListener {
            val intent = Intent(applicationContext, AIActivity::class.java)
            startActivity(intent)
        }
        btnDS.setOnClickListener {
            val intent = Intent(applicationContext, DataScienceActivity::class.java)
            startActivity(intent)
        }
        btnWeb.setOnClickListener {
            val intent = Intent(applicationContext, WebDevelopmentActivity::class.java)
            startActivity(intent)
        }
        btnCallUs.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:9876543210"))
            startActivity(intent)
        }
        btnBack.setOnClickListener {
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}