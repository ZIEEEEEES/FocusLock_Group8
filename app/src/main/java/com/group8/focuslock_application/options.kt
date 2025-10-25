package com.group8.focuslock_application

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Options : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.options_page)

        // Allow proper insets (for status/navigation bars)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ✅ Done Button → Go to SignUp page
        val doneButton = findViewById<ImageButton>(R.id.doneButton)
        doneButton.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }

        // ⚙️ Settings Button → Go to Settings Page
        val settingsButton = findViewById<ImageButton>(R.id.imageButton1)
        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        // 🏆 Leaderboards Button → Go to Leaderboards Page
        val leaderboardsButton = findViewById<ImageButton>(R.id.imageButton2)
        leaderboardsButton.setOnClickListener {
            val intent = Intent(this, Leaderboards::class.java)
            startActivity(intent)
        }

        // 🧩 Option Button 1 → Go to AppsOnTimeout Page
        val optionButton1 = findViewById<ImageButton>(R.id.imageButton3)
        optionButton1.setOnClickListener {
            val intent = Intent(this, AppsOnTimeout::class.java)
            startActivity(intent)
        }

        // 🧩 Option Button 2 → Go to ParentAppPage
        val optionButton2 = findViewById<ImageButton>(R.id.imageButton4)
        optionButton2.setOnClickListener {
            val intent = Intent(this, ParentAppPage::class.java)
            startActivity(intent)
        }
    }
}
