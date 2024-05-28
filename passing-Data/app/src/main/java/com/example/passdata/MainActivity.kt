package com.example.passdata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the views
        val inputEditText: EditText = findViewById(R.id.inputEditText)
        val sendButton: Button = findViewById(R.id.sendButton)

        // Set a click listener on the button
        sendButton.setOnClickListener {
            // Get the input data
            val data = inputEditText.text.toString()

            // Create an intent to start the second activity
            val intent = Intent(this, secondActivity::class.java).apply {
                putExtra("EXTRA_DATA", data)
            }

            // Start the second activity
            startActivity(intent)
        }
    }
}
