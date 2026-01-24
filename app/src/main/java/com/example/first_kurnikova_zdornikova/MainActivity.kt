package com.example.first_kurnikova_zdornikova

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import com.example.first_kurnikova_zdornikova.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        binding.buttonRes.setOnClickListener {
            val randomNumber = Random.nextInt(1, 7)
            binding.textViewRes.text = getString(R.string.res_text, randomNumber)
        }
    }
}