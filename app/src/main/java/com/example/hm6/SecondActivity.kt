package com.example.hm6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hm6.databinding.ActivitySecondBinding
import com.example.hm6.databinding.FragmentSecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getDataMusicName()
    }
    private fun getDataMusicName() {
        val nameMusic = intent.getStringExtra("nameMusic")
        binding.blanck.text = nameMusic
    }
}