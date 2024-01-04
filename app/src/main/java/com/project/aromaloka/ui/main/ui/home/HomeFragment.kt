package com.project.aromaloka.ui.main.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.aromaloka.adapter.PerfumeAdapter
import com.project.aromaloka.adapter.PopularPerfumeAdapter
import com.project.aromaloka.databinding.FragmentHomeBinding
import com.project.aromaloka.ui.detail.PerfumeDetailActivity

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHomeRecyclerView()
    }

    private fun setHomeRecyclerView() {
        binding.apply {
            val perfumeAdapter = PerfumeAdapter {
                val iDetail = Intent(requireContext(), PerfumeDetailActivity::class.java)
                startActivity(iDetail)
            }

            val popularPerfumeAdapter = PopularPerfumeAdapter {
                val iDetail = Intent(requireContext(), PerfumeDetailActivity::class.java)
                startActivity(iDetail)
            }

            rvForMe.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = perfumeAdapter
            }

            rvPopular.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = popularPerfumeAdapter
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}