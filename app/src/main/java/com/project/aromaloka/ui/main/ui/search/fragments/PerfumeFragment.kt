package com.project.aromaloka.ui.main.ui.search.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.aromaloka.adapter.SearchedPerfumeAdapter
import com.project.aromaloka.databinding.FragmentPerfumeBinding
import com.project.aromaloka.ui.detail.PerfumeDetailActivity

class PerfumeFragment : Fragment() {
    private var _binding: FragmentPerfumeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPerfumeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvPerfumeSearch.apply {
            val searchedPerfumeAdapter = SearchedPerfumeAdapter()

            searchedPerfumeAdapter.listener = {
                val iPerfumeDetail = Intent(requireContext(), PerfumeDetailActivity::class.java)
                startActivity(iPerfumeDetail)
            }

            layoutManager = LinearLayoutManager(requireContext())
            adapter = searchedPerfumeAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}