package com.example.routineritual

import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.routineritual.databinding.ActivityLoginBinding
import com.example.routineritual.databinding.ActivityPage2Binding

class Login : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.Loginbtn.setOnClickListener{
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }
        binding.donthavebtn.setOnClickListener{
            val intent=Intent(this,signup::class.java)
            startActivity(intent)

    }
}
}