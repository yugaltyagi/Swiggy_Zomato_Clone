package com.example.routineritual

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.routineritual.databinding.ActivityChooseLocationBinding

class Choose_location : AppCompatActivity() {
    private val binding:ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val locationist = arrayOf("Delhi", "Greater Noida", "Noida", "vaishali")
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, locationist)
        val autoCompleteTextView = binding.listoflocatin
        autoCompleteTextView.setAdapter(adapter)
    }
}