package com.example.myrepo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrepo.databinding.ActivityMainBinding
import com.example.myrepo.shadow.ShadowTestActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupButton()
    }

    private fun setupButton(){
        binding.btnMainShadow.setOnClickListener {
            val intent = Intent(this, ShadowTestActivity::class.java)
            startActivity(intent)
        }
    }
}