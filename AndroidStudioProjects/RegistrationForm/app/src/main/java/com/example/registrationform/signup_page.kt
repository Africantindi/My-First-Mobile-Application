package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrationform.databinding.ActivitySignupPageBinding

private lateinit var binding: ActivitySignupPageBinding
class signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sign.setOnClickListener {
            var getSignupp = Intent(applicationContext, login_page::class.java)
            startActivity(getSignupp)
        }

        binding.log.setOnClickListener {
            var getLogin = Intent(applicationContext, login_page::class.java)
            startActivity(getLogin)
        }
    }
}