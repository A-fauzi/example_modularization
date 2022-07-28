package com.afauzi.example_modularizatio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afauzi.example_modularizatio.databinding.ActivityMainBinding
import com.afauzi.feature_a.FeatureAActivity
import com.afauzi.feature_b.FeatureBActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.btnFeatureA.setOnClickListener {
            startActivity(Intent(this, FeatureAActivity::class.java))
        }
        binding.btnFeatureB.setOnClickListener {
            startActivity(Intent(this, FeatureBActivity::class.java))
        }
    }
}