package com.example.imaginaria.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.imaginaria.R
import com.example.imaginaria.databinding.ActivityMenuScreenBinding

class MenuScreen : AppCompatActivity() {
    private lateinit var binding: ActivityMenuScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.startButton.setOnClickListener {
            val intent = Intent(this, Screen1Activity::class.java)
            startActivity(intent)
        }
    }
}