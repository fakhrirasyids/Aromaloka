package com.project.aromaloka.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.project.aromaloka.R
import com.project.aromaloka.databinding.ItemNotesListBinding
import com.project.aromaloka.models.Note

@RequiresApi(Build.VERSION_CODES.M)
class NotesFilterAdapter(
    private val context: Context,
    private val notesList: ArrayList<Note>
) : RecyclerView.Adapter<NotesFilterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ItemNotesListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            notesList[position].isClicked = !notesList[position].isClicked
            holder.setViewToColor(notesList[position].isClicked)
        }
    }

    override fun getItemCount() = notesList.size

    class ViewHolder(private var itemBinding: ItemNotesListBinding, var context: Context) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun setViewToColor(isClicked: Boolean) {
            if (isClicked) {
                itemBinding.layoutContent.setBackgroundColor(context.getColor(R.color.primaryColorBrown))
            } else {
                itemBinding.layoutContent.setBackgroundColor(context.getColor(R.color.primaryBtnBackgroundOpacity))
            }
        }
    }
}