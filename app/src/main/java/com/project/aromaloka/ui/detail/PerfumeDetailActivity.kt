package com.project.aromaloka.ui.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.aromaloka.databinding.ActivityPerfumeDetailBinding

class PerfumeDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPerfumeDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfumeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            btnBack.setOnClickListener {
                finish()
            }

            tvPerfumeBrand.setOnClickListener {
                val iBrand = Intent(this@PerfumeDetailActivity, BrandDetailActivity::class.java)
                startActivity(iBrand)
            }
        }
    }
}