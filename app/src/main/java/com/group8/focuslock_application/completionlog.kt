package com.group8.focuslock_application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Completionlog : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.parent_completionlog_page)

        // Handle system insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 🔙 Back Button → returns to previous screen
        val backButton = findViewById<ImageButton>(R.id.imageButton1)
        backButton.setOnClickListener {
            finish()
        }

        // ⚙️ Options Button → opens Options page
        val optionsButton = findViewById<ImageButton>(R.id.imageButton2)
        optionsButton.setOnClickListener {
            val intent = Intent(this, Options::class.java)
            startActivity(intent)
        }

        // ⚙️ Settings Button → opens Settings page
        val settingsButton = findViewById<ImageButton>(R.id.imageButton3)
        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        // 🏆 Leaderboards Button → opens Leaderboards page
        val leaderboardsButton = findViewById<ImageButton>(R.id.imageButton4)
        leaderboardsButton.setOnClickListener {
            val intent = Intent(this, Leaderboards::class.java)
            startActivity(intent)
        }
    }
}
