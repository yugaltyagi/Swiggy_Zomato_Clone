package com.example.routineritual.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.routineritual.databinding.CartItemBinding

class CartAdapter (private val cartItems:MutableList<String>, private val CartItemPrice: MutableList<String>, private var CartImage :MutableList<Int>): RecyclerView.Adapter<CartAdapter.CartViewHolder>() {
private val itemQuantites = IntArray(cartItems.size){1}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return CartViewHolder(binding)
    }



    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }
    override fun getItemCount(): Int = cartItems.size

  inner class CartViewHolder(private  val binding: CartItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                val quantity = itemQuantites[position]
                cartFoodName.text = cartItems[position]
                cartItemPrice.text = CartItemPrice[position]
                cartImage.setImageResource(CartImage[position])
                cartitemquantity.text=quantity.toString()

                minusButton.setOnClickListener{

                }
                plusButton.setOnClickListener{

                }
                deleteButton.setOnClickListener{
                    
                }
            }
        }

    }
}