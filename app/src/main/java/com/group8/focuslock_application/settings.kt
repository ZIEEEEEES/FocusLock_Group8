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

        // Handle insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔙 Back Button (imageButton6)
        val backButton = findViewById<ImageButton>(R.id.imageButton6)
        backButton.setOnClickListener {
            finish() // returns to previous activity
        }

        // ⚙️ Settings Button (imageButton1)
        val settingsButton = findViewById<ImageButton>(R.id.imageButton1)
        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }

        // 🏆 Leaderboards Button (imageButton2)
        val leaderboardsButton = findViewById<ImageButton>(R.id.imageButton2)
        leaderboardsButton.setOnClickListener {
            val intent = Intent(this, Leaderboards::class.java)
            startActivity(intent)
        }

        // 📱 Apps Button (imageButton3)
        val appsButton = findViewById<ImageButton>(R.id.imageButton3)
        appsButton.setOnClickListener {
            val intent = Intent(this, ParentAppPage::class.java)
            startActivity(intent)
        }

        // 📅 Schedule Button (imageButton4)
        val scheduleButton = findViewById<ImageButton>(R.id.imageButton4)
        scheduleButton.setOnClickListener {
            val intent = Intent(this, ParentSetTasks::class.java)
            startActivity(intent)
        }

        // 📋 Logs Button (imageButton5)
        val logsButton = findViewById<ImageButton>(R.id.imageButton5)
        logsButton.setOnClickListener {
            val intent = Intent(this, Completionlog::class.java)
            startActivity(intent)
        }

        // ⚙️ Options Button (imageButton7)
        val optionsButton = findViewById<ImageButton>(R.id.imageButton7)
        optionsButton.setOnClickListener {
            val intent = Intent(this, SettingsVerify::class.java)
            startActivity(intent)
        }
    }
}
