package com.project.aromaloka.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.aromaloka.databinding.ActivityLoginBinding
import com.project.aromaloka.ui.main.BottomMainActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.apply {
            btnLogin.setOnClickListener {
                val iMain = Intent(this@LoginActivity, BottomMainActivity::class.java)
                startActivity(iMain)
            }

            btnRegister.setOnClickListener {
                val iRegister = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(iRegister)
            }
        }
    }
}