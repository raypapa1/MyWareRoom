package com.example.myrepo.shadow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrepo.R
import com.example.myrepo.databinding.ActivityShadowTestBinding

class ShadowTestActivity : AppCompatActivity() {
    lateinit var binding: ActivityShadowTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShadowTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}