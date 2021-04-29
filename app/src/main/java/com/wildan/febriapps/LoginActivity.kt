package com.wildan.febriapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.febriapps.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnBack.setOnClickListener {
                finish()
            }
            btnLogin.setOnClickListener {
                val email = edtEmail.text.toString().trim()
                val password = edtPassword.text.toString().trim()
                if (email.isEmpty()){
                    edtEmail.error = "Harap memasukkan username"
                }else if (password.isEmpty()){
                    edtPassword.error = "Harap memasukkan password"
                }else{
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    intent.putExtra(MainActivity.EXTRA_EMAIL, email)
                    startActivity(intent)
                    finish()
                }

            }
            btnSignup.setOnClickListener {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}