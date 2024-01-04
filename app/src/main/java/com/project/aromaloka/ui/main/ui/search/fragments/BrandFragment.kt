package com.project.aromaloka.ui.main.ui.search.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.aromaloka.adapter.BrandAdapter
import com.project.aromaloka.databinding.FragmentBrandBinding
import com.project.aromaloka.ui.detail.BrandDetailActivity

class BrandFragment : Fragment() {
    private var _binding: FragmentBrandBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBrandBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvBrandSearch.apply {
            val brandAdapter = BrandAdapter()

            brandAdapter.listener = {
                val iBrandDetail = Intent(requireContext(), BrandDetailActivity::class.java)
                startActivity(iBrandDetail)
            }

            layoutManager = LinearLayoutManager(requireContext())
            adapter = brandAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}