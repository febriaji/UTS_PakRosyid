package com.wildan.febriapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.febriapps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{
        val EXTRA_EMAIL = "extra_email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(EXTRA_EMAIL)
        if (username == null){
            binding.tvUsername.text = "Guys"
        }else{
            binding.tvUsername.text = username
        }

    }
}