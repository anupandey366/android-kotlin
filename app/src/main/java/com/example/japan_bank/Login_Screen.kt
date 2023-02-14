package com.example.japan_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login_screen.*
import kotlinx.android.synthetic.main.tutorials1.*

class Login_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        tvReg.setOnClickListener {
            val intent= Intent(this@Login_Screen,Register_Screen::class.java)
            startActivity(intent)
        }
    }
}