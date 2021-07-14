package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.registrationform.databinding.ActivityLoginPageBinding

private lateinit var binding: ActivityLoginPageBinding
class login_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener {
            var getMain = Intent(applicationContext, MainActivity::class.java)

            var user = binding.getUser.text.toString()
            var password = binding.getPassword.text.toString()

            if(user !="" && password!=""){
                if(user == "2021" && password == "admin"){
                    startActivity(getMain)
                } else{
                    Toast.makeText(applicationContext, "Invalid credentials", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(applicationContext, "Please Enter credentials", Toast.LENGTH_SHORT).show()
            }

        }


        binding.signin.setOnClickListener {
            var getSignup = Intent(applicationContext, signup_page::class.java)
            startActivity(getSignup)
        }
    }
}