package com.example.activityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnRegister.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity, SecondActivity::class.java)
                intentToSecondActivity.putExtra(EXTRA_USERNAME, usernameEditText.text.toString())
                intentToSecondActivity.putExtra(EXTRA_EMAIL, emailEditText.text.toString())
                intentToSecondActivity.putExtra(EXTRA_PHONE, phoneEditText.text.toString())
                startActivity(intentToSecondActivity)
            }
        }
    }
}