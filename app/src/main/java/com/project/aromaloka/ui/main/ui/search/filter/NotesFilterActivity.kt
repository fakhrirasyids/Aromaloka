package com.project.aromaloka.ui.main.ui.search.filter

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.project.aromaloka.adapter.NotesFilterAdapter
import com.project.aromaloka.databinding.ActivityNotesFilterBinding
import com.project.aromaloka.models.Note

@RequiresApi(Build.VERSION_CODES.M)
class NotesFilterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotesFilterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotesFilterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
        setContent()
    }

    private fun setListeners() {
        binding.apply {
            btnBack.setOnClickListener { finish() }
        }
    }

    private fun setContent() {
        binding.rvNotesSearch.apply {
            val notesList = ArrayList<Note>()

            for (i in 1..20) {
                val note = Note()
                notesList.add(note)
            }

            val notesFilterAdapter = NotesFilterAdapter(context, notesList)

            layoutManager = GridLayoutManager(this@NotesFilterActivity, 2)
            adapter = notesFilterAdapter
        }
    }
}