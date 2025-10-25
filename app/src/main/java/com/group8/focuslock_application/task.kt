package com.group8.focuslock_application

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Task : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.task_page)

        // Handle system bar insets (for fullscreen layout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Settings button → opens Settings page
        val settingsButton = findViewById<ImageButton>(R.id.imageButton1)
        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        // Apps button → opens Apps page
        val appsButton = findViewById<ImageButton>(R.id.imageButton2)
        appsButton.setOnClickListener {
            val intent = Intent(this, AppsOnTimeout::class.java)
            startActivity(intent)
        }

        // Leaderboards button → opens Leaderboards page
        val leaderboardButton = findViewById<ImageButton>(R.id.imageButton4)
        leaderboardButton.setOnClickListener {
            val intent = Intent(this, Leaderboards::class.java)
            startActivity(intent)
        }

        // Task button → stays on the same page (Task)
        val taskButton = findViewById<ImageButton>(R.id.imageButton3)
        taskButton.setOnClickListener {
            // Optional: Add Toast or sound effect here if you want feedback
        }
    }
}
