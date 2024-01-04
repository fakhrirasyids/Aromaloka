package com.project.aromaloka.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.project.aromaloka.databinding.ItemSearchedPerfumeBinding

class SearchedPerfumeAdapter : RecyclerView.Adapter<SearchedPerfumeAdapter.ViewHolder>() {
    var listener: (() -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v =
            ItemSearchedPerfumeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (listener != null) {
            holder.itemView.setOnClickListener { listener?.invoke() }
        }
    }

    override fun getItemCount() = 6

    class ViewHolder(itemBinding: ItemSearchedPerfumeBinding) :
        RecyclerView.ViewHolder(itemBinding.root)
}