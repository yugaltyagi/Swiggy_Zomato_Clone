package com.example.routineritual

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.routineritual.databinding.ActivityLoginBinding
import com.example.routineritual.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {
    private val binding: ActivitySignupBinding by lazy {
        ActivitySignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.alreadyhaveaccount.setOnClickListener{
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        }
    }