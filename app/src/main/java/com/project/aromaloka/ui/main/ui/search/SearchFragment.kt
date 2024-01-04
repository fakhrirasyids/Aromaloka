package com.project.aromaloka.ui.main.ui.search

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.project.aromaloka.adapter.BrandAdapter
import com.project.aromaloka.adapter.NotesAdapter
import com.project.aromaloka.databinding.FragmentSearchBinding
import com.project.aromaloka.ui.main.ui.search.filter.FilterActivity
import com.project.aromaloka.ui.main.ui.search.searchresult.SearchResultActivity

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setListeners()
        setSearchRecyclerView()
    }

    private fun setListeners() {
        binding.apply {
            svPerfume.setOnClickListener {
                val iSearchResult = Intent(requireContext(), SearchResultActivity::class.java)
                startActivity(iSearchResult)
            }

            btnFilter.setOnClickListener {
                val iFilter = Intent(requireContext(), FilterActivity::class.java)
                startActivity(iFilter)
            }
        }
    }

    private fun setSearchRecyclerView() {
        binding.apply {
            val notesAdapter = NotesAdapter()
            val brandAdapter = BrandAdapter()

            rvNotes.apply {
                layoutManager = GridLayoutManager(requireContext(), 2)
                adapter = notesAdapter
            }

            rvBrand.apply {
                layoutManager = GridLayoutManager(requireContext(), 2)
                adapter = brandAdapter
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        val titleArray = arrayOf(
            "Perfume",
            "Brand"
        )
    }
}