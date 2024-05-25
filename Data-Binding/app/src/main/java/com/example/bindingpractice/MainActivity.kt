package com.example.bindingpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.bindingpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
     private var result:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        setContentView(R.layout.activity_main)




        binding.button.setOnClickListener{
           val num1 =  binding.editTextText.text.toString().toInt()
           val num2 = binding.editTextText2.text.toString().toInt()
            result = (num1+num2).toString()
            val res = ResultClass(""+result)
            binding.classResult =res

            val username = User("Bisharat Ali")
            binding.user= username
        }
    }
}