package com.group8.focuslock_application

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ParentApps : AppCompatActivity() { //  Use uppercase class name
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.parent_apps_page)

        //  Handles padding for system bars (safe area)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //  Find the doneButton in XML
        val doneButton: ImageButton = findViewById(R.id.doneButton)

        //  When clicked → go back to Login page (or any other page)
        doneButton.setOnClickListener {
            val intent = Intent(this, Login::class.java) // 'Login' should also start with capital L
            startActivity(intent)
            finish()
        }
    }
}