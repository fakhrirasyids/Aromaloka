package com.project.aromaloka.ui.starter

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.project.aromaloka.R
import com.project.aromaloka.adapter.StarterPagerAdapter
import com.project.aromaloka.databinding.ActivityStarterBinding
import com.project.aromaloka.ui.auth.LoginActivity
import com.zhpan.indicator.enums.IndicatorSlideMode
import com.zhpan.indicator.enums.IndicatorStyle

@RequiresApi(Build.VERSION_CODES.M)
class StarterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStarterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStarterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setViewPager()
        setListeners()

    }

    private fun setViewPager() {
        binding.apply {
            val adapter = StarterPagerAdapter(this@StarterActivity)
            viewPager.adapter = adapter

            layoutTab.apply {
                setSliderColor(
                    getColor(R.color.secondaryColorPink),
                    getColor(R.color.primaryColorPink)
                )
                setSliderWidth(resources.getDimension(com.intuit.sdp.R.dimen._60sdp))
                setSliderHeight(resources.getDimension(com.intuit.sdp.R.dimen._4sdp))
                setSlideMode(IndicatorSlideMode.WORM)
                setIndicatorStyle(IndicatorStyle.DASH)
                setupWithViewPager(viewPager)
            }
        }
    }

    private fun setListeners() {
        binding.apply {
            btnNext.setOnClickListener {
                val index = viewPager.currentItem
                if (index == 2) {
                    startActivity(Intent(this@StarterActivity, LoginActivity::class.java))
                }
                viewPager.setCurrentItem(index + 1, true)
            }

            btnSkip.setOnClickListener {
                startActivity(Intent(this@StarterActivity, LoginActivity::class.java))
            }
        }
    }
}