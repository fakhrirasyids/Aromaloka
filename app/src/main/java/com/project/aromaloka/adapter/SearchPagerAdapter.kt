package com.project.aromaloka.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.project.aromaloka.ui.main.ui.search.fragments.BrandFragment
import com.project.aromaloka.ui.main.ui.search.fragments.PerfumeFragment

class SearchPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = PerfumeFragment()
            1 -> fragment = BrandFragment()
        }
        return fragment as Fragment
    }

    override fun getItemCount(): Int {
        return 2
    }
}