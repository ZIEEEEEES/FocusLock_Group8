package com.group8.focuslock_application

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppsOnTimeout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.appsontimeout_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Image Buttons
        val settingsButton = findViewById<ImageButton>(R.id.imageButton1)
        val appsButton = findViewById<ImageButton>(R.id.imageButton2)
        val tasksButton = findViewById<ImageButton>(R.id.imageButton3)
        val leaderboardButton = findViewById<ImageButton>(R.id.imageButton4)

        // ✅ Click Listeners
        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        appsButton.setOnClickListener {
            val intent = Intent(this, AppsOnTimeout::class.java)
            startActivity(intent)
        }

        tasksButton.setOnClickListener {
            val intent = Intent(this, Task::class.java)
            startActivity(intent)
        }

        leaderboardButton.setOnClickListener {
            val intent = Intent(this, Leaderboards::class.java)
            startActivity(intent)
        }
    }
}
