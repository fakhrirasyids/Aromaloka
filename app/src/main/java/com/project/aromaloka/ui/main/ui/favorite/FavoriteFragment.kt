package com.project.aromaloka.ui.main.ui.favorite

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.aromaloka.adapter.FavoritedPerfumeAdapter
import com.project.aromaloka.databinding.FragmentFavoriteBinding
import com.project.aromaloka.ui.detail.PerfumeDetailActivity

class FavoriteFragment : Fragment() {

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setFavoritedContent()
    }

    private fun setFavoritedContent() {
        binding.rvPerfumeFav.apply {
            val favoritedPerfumeAdapter = FavoritedPerfumeAdapter()

            favoritedPerfumeAdapter.listener = {
                val iPerfumeDetail = Intent(requireContext(), PerfumeDetailActivity::class.java)
                startActivity(iPerfumeDetail)
            }

            layoutManager = LinearLayoutManager(requireContext())
            adapter = favoritedPerfumeAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}