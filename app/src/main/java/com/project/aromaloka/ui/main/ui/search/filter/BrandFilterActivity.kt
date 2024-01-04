package com.project.aromaloka.ui.main.ui.search.filter

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.aromaloka.adapter.BrandFilterAdapter
import com.project.aromaloka.databinding.ActivityBrandFilterBinding
import com.project.aromaloka.models.Brand

@RequiresApi(Build.VERSION_CODES.M)
class BrandFilterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrandFilterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandFilterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
        setContent()
    }

    private fun setListeners() {
        binding.apply {
            btnBack.setOnClickListener {
                finish()
            }
        }
    }

    private fun setContent() {
        binding.rvBrandSearch.apply {
            val brandList = ArrayList<Brand>()

            for (i in 1..10) {
                val brand = Brand()
                brandList.add(brand)
            }

            val brandFilterAdapter = BrandFilterAdapter(context, brandList)

            layoutManager = LinearLayoutManager(this@BrandFilterActivity)
            adapter = brandFilterAdapter
        }
    }
}