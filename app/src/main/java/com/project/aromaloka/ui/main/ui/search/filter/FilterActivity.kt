package com.project.aromaloka.ui.main.ui.search.filter

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.project.aromaloka.databinding.ActivityFilterBinding
import com.project.aromaloka.ui.main.ui.search.searchresult.SearchResultActivity

class FilterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFilterBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun setListeners() {
        binding.apply {
            btnBack.setOnClickListener {
                finish()
            }

            layoutBrand.setOnClickListener {
                val iBrand = Intent(this@FilterActivity, BrandFilterActivity::class.java)
                startActivity(iBrand)
            }

            layoutNotes.setOnClickListener {
                val iNotes = Intent(this@FilterActivity, NotesFilterActivity::class.java)
                startActivity(iNotes)
            }

            btnSearch.setOnClickListener {
                val iSearchResult = Intent(this@FilterActivity, SearchResultActivity::class.java)
                startActivity(iSearchResult)
            }
        }
    }
}