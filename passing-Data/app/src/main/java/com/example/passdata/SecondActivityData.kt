package com.example.passdata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.passdata.databinding.ActivitySecondBinding

class SecondActivityData : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the data passed from the first activity
        val receivedData1 = intent.getStringExtra(MainActivity.EXTRA_DATA1)
        val receivedData2 = intent.getStringExtra(MainActivity.EXTRA_DATA2)

        // Set the received data to the TextViews
        binding.displayTextView1.text = receivedData1
        binding.displayTextView2.text = receivedData2
    }
}