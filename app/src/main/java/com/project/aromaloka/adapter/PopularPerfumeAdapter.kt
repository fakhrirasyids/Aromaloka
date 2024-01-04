package com.project.aromaloka.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.aromaloka.databinding.ItemHomePopularListBinding

class PopularPerfumeAdapter(
    private val listener: () -> Unit
) :
    RecyclerView.Adapter<PopularPerfumeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            ItemHomePopularListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener { listener() }
    }

    override fun getItemCount() = 6

    class ViewHolder(itemBinding: ItemHomePopularListBinding) :
        RecyclerView.ViewHolder(itemBinding.root)
}