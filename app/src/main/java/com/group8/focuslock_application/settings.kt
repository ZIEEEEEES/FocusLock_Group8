package com.group8.focuslock_application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton

class Settings : AppCompatActivity() {
    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.settings_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔙 Back Button
        val backButton = findViewById<ImageButton>(R.id.imageButton6)
        backButton.setOnClickListener {
            finish() // returns to previous activity
        }

        // ⚙️ Settings Button (refresh same page)
        val settingsButton = findViewById<ImageButton>(R.id.imageButton1)
        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }

        // 🏆 Leaderboards Button
        val leaderboardsButton = findViewById<ImageButton>(R.id.imageButton4)
        leaderboardsButton.setOnClickListener {
            val intent = Intent(this, Leaderboards::class.java)
            startActivity(intent)
        }

        // 📱 Apps Button
        val appsButton = findViewById<ImageButton>(R.id.imageButton5)
        appsButton.setOnClickListener {
            val intent = Intent(this, ParentAppPage::class.java)
            startActivity(intent)
        }

        // 📅 Schedule Button
        val scheduleButton = findViewById<ImageButton>(R.id.imageButton6)
        scheduleButton.setOnClickListener {
            val intent = Intent(this, ParentSetTasks::class.java)
            startActivity(intent)
        }

        // 📋 Logs Button → opens completionlog page
        val logsButton = findViewById<ImageButton>(R.id.imageButton7)
        logsButton.setOnClickListener {
            val intent = Intent(this, Completionlog::class.java)
            startActivity(intent)
        }
    }
}
