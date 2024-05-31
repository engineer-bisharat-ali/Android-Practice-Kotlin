package com.example.passdata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.passdata.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        const val EXTRA_DATA1 = "com.example.passdata.MainActivity.EXTRA_DATA1"
        const val EXTRA_DATA2 = "com.example.passdata.MainActivity.EXTRA_DATA2"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set a click listener on the button
        binding.sendButton.setOnClickListener {
            // Get the input data from EditTexts
            val data1 = binding.inputEditText1.text.toString()
            val data2 = binding.inputEditText2.text.toString()

            // Create an intent to start the second activity
            val intent = Intent(this,SecondActivityData::class.java).apply {
                putExtra(EXTRA_DATA1, data1)
                putExtra(EXTRA_DATA2, data2)
            }

            // Start the second activity
            startActivity(intent)
        }
    }
}
