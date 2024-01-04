package com.project.aromaloka.adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.project.aromaloka.R
import com.project.aromaloka.databinding.ItemBrandListBinding
import com.project.aromaloka.models.Brand

@RequiresApi(Build.VERSION_CODES.M)
class BrandFilterAdapter(
    private val context: Context,
    private val brandList: ArrayList<Brand>
) : RecyclerView.Adapter<BrandFilterAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = ItemBrandListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(v, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.setOnClickListener {
            brandList[position].isClicked = !brandList[position].isClicked
            holder.setViewToColor(brandList[position].isClicked)
        }
    }

    override fun getItemCount() = brandList.size

    class ViewHolder(private var itemBinding: ItemBrandListBinding, var context: Context) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun setViewToColor(isClicked: Boolean) {
            if (isClicked) {
                itemBinding.layoutContent.setBackgroundColor(context.getColor(R.color.primaryColorPink))
            } else {
                itemBinding.layoutContent.setBackgroundColor(context.getColor(R.color.primaryColorGreen))
            }
        }
    }
}