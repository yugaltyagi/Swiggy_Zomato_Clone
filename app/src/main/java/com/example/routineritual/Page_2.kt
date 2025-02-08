//package com.example.routineritual
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Button
//import androidx.activity.enableEdgeToEdge
//import androidx.appcompat.app.AppCompatActivity
//import androidx.core.view.ViewCompat
//import androidx.core.view.WindowInsetsCompat
//
//class Page_2 : AppCompatActivity() {
//
//    private lateinit var button01: Button
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_page2)
//
//        button01 = findViewById(R.id.Btn2)
//
//        button01.setOnClickListener {
//            val intent = Intent(this, Login::class.java)
//            startActivity(intent)
//        }
//    }
//}

package com.example.routineritual

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.routineritual.databinding.ActivityPage2Binding // Ensure correct package name for binding

class Page_2 : AppCompatActivity() {

    // Lazy initialization of the binding instance
    private val binding: ActivityPage2Binding by lazy {
        ActivityPage2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root) // Set the content view to the binding's root view

        // Setting up the button click listener
        binding.Btn2.setOnClickListener {
            val intent = Intent(this, Login::class.java) // Navigate to the Login activity
            startActivity(intent)
        }
    }
}
