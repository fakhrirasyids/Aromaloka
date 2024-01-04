package com.project.aromaloka.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.aromaloka.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            btnRegister.setOnClickListener {
                finish()
            }

            btnLogin.setOnClickListener {
                finish()
            }
        }
    }
}