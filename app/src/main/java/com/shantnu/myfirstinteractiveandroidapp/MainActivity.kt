package com.shantnu.myfirstinteractiveandroidapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonLight = findViewById<Button>(R.id.btnLight)
        val buttonReset = findViewById<Button>(R.id.btnReset)
        val layout = findViewById<LinearLayout>(R.id.main)

        buttonDark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
        }

        buttonLight.setOnClickListener{
            layout.setBackgroundResource(R.color.white)
        }

        buttonReset.setOnClickListener{
            layout.setBackgroundResource(R.color.backgroundMain)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}