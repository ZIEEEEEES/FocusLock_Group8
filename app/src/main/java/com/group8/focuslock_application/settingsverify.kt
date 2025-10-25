package com.group8.focuslock_application

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageButton

class SettingsVerify : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.settingsverify_page)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Done button — returns to Settings page
        val doneButton = findViewById<ImageButton>(R.id.imageButton5)
        doneButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
            finish()
        }

        // ✅ Bottom navigation buttons
        val settingsButton = findViewById<ImageButton>(R.id.imageButton1)
        val appsButton = findViewById<ImageButton>(R.id.imageButton2)
        val taskButton = findViewById<ImageButton>(R.id.imageButton3)
        val leaderboardsButton = findViewById<ImageButton>(R.id.imageButton4)

        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        appsButton.setOnClickListener {
            val intent = Intent(this, AppsOnTimeout::class.java)
            startActivity(intent)
        }

        taskButton.setOnClickListener {
            val intent = Intent(this, Task::class.java)
            startActivity(intent)
        }

        leaderboardsButton.setOnClickListener {
            val intent = Intent(this, Leaderboards::class.java)
            startActivity(intent)
        }
    }
}
