package com.example.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityintent.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(MainActivity.EXTRA_USERNAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
        val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)

        with(binding){

            usernameTextView.text = "Welcome $username"
            emailTextView.text = "Your $email has been activated"
            phoneTextView.text = "Your $phone has been registered"

            btnLogout.setOnClickListener {
                val intentToMainActivity =
                    Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }
        }
    }
}