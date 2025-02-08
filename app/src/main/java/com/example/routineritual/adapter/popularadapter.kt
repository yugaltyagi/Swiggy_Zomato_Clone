package com.example.routineritual.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.routineritual.databinding.FragmentHomeBinding
import com.example.routineritual.databinding.PopularBinding

class popularadapter (private val items:List<String>,private val price :List<String>,private val image:List<Int>) : RecyclerView.Adapter<popularadapter.PopulerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopulerViewHolder {
    return PopulerViewHolder(PopularBinding.inflate(LayoutInflater.from(parent.context),parent, false))
    }


    override fun onBindViewHolder(holder: PopulerViewHolder, position: Int) {
        val item = items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item,price,images)
    }
    override fun getItemCount(): Int {
        return items.size
    }

    class PopulerViewHolder (private val binding: PopularBinding): RecyclerView.ViewHolder(binding.root) {
        val imageView = binding.imageView2
        fun bind(item: String,price: String, images: Int) {
            binding.Foodnamepopuler.text = item
            binding.pricepopuler.text = price
            imageView.setImageResource(images)
        }

    }
}