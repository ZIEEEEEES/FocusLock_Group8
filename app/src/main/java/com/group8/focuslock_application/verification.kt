package com.group8.focuslock_application

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Verification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.verification_page)

        // Adjust for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Proceed button → AppsOnTimeout screen
        val proceedButton = findViewById<ImageButton>(R.id.proceedButton1)
        proceedButton.setOnClickListener {
            val intent = Intent(this, AppsOnTimeout::class.java)
            startActivity(intent)
            finish() // optional: closes Verification screen
        }
    }
}
