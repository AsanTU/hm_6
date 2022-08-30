package com.example.hm6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.conteiner,FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.conteiner2,SecondFragment()).commit()
    }
}