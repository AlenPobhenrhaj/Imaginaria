package com.example.imaginaria.app

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.imaginaria.R
import com.example.imaginaria.databinding.ActivityScreen1Binding

class Screen1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityScreen1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreen1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Create a MediaController and set it to your VideoView
        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.simpleVideoView)

        // Set the MediaController for the VideoView
        binding.simpleVideoView.setMediaController(mediaController)

        // Set the Uri for the VideoView
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.test)
        binding.simpleVideoView.setVideoURI(videoUri)

        // Start the VideoView
        binding.simpleVideoView.start()
    }
}