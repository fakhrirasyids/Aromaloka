package com.project.aromaloka.ui.detail

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.project.aromaloka.adapter.PerfumeAdapter
import com.project.aromaloka.databinding.ActivityBrandDetailBinding

class BrandDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrandDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
        setBrandRecyclerView()
    }

    private fun setListeners() {
        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun setBrandRecyclerView() {
        binding.rvBrandPerfume.apply {
            val perfumeBrandAdapter = PerfumeAdapter {
                val iDetail = Intent(this@BrandDetailActivity, PerfumeDetailActivity::class.java)
                startActivity(iDetail)
            }

            layoutManager = GridLayoutManager(this@BrandDetailActivity, 2)
            adapter = perfumeBrandAdapter
        }
    }
}