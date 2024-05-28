package com.example.passdata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Get the data passed from the first activity
        val receivedData = intent.getStringExtra("EXTRA_DATA")

        // Find the TextView and set the received data
        val displayTextView: TextView = findViewById(R.id.displayTextView)
        displayTextView.text = receivedData
    }
}
