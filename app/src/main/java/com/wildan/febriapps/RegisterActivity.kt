package com.wildan.febriapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wildan.febriapps.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnBack.setOnClickListener {
                finish()
            }
            btnRegister.setOnClickListener {
                val email = edtEmail.text.toString().trim()
                val username = edtUsername.text.toString().trim()
                val password = edtPassword.text.toString().trim()
                if (email.isEmpty()){
                    edtEmail.error = "Harap memasukkan email"
                }else if (password.isEmpty()){
                    edtPassword.error = "Harap memasukkan password"
                }else if(username.isEmpty()){
                    edtUsername.error = "Harap memasukkan username"
                }
                else{
                    val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                    startActivity(intent)
                }
            }
            btnLogin.setOnClickListener {
                startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
            }
        }
    }
}