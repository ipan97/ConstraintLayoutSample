package com.dicoding.ipanrahman.sundafoodapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * @author Ipan Taupik Rahman.
 */
class FoodAdapter(
    val foods: ArrayList<Food>,
    val onItemClickCallback: (Food) -> Unit
) :
    RecyclerView.Adapter<FoodAdapter.FilmViewHolder>() {

    override fun getItemCount(): Int {
        return foods.size
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        val food: Food = foods[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.mIvPhoto)
        holder.mTvTitle.text = food.title
        holder.mTvDescription.text = food.description
        holder.itemView.setOnClickListener { onItemClickCallback(foods[holder.adapterPosition]) }
    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int
    ): FilmViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_food, viewGroup, false)
        return FilmViewHolder(view)
    }

    inner class FilmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mTvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var mTvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
        var mIvPhoto: ImageView = itemView.findViewById(R.id.iv_item_photo)
    }
}