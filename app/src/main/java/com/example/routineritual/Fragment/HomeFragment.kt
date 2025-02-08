package com.example.routineritual.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.routineritual.R
import com.example.routineritual.adapter.popularadapter
import com.example.routineritual.databinding.ActivityLoginBinding
import com.example.routineritual.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

        val imageList =ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner3, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

            imageSlider.setItemClickListener(object :ItemClickListener{
                override fun doubleClick(position: Int) {
                    TODO("Not yet implemented")
                }

                override fun onItemSelected(position: Int) {
                    val itemPosition = imageList[position]
                    val itemMeassage="Selected Image $position"
                    Toast.makeText(requireContext(),itemMeassage, Toast.LENGTH_SHORT).show()
                }
            })
            val foodname = listOf("Burger", "Sandwich", "Momos", "item")
            val price = listOf("$5","$7","$8","$9")
            val popularfoodimages = listOf(R.drawable.menu1, R.drawable.menu2, R.drawable.menu3,R.drawable.menu4)
            val adapter = popularadapter(foodname, price,popularfoodimages)
            binding.PopulerRecyclerView.layoutManager = LinearLayoutManager(requireContext())
            binding.PopulerRecyclerView.adapter = adapter
    }
    companion object {
    }
}