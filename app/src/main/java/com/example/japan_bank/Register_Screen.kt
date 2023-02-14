package com.example.japan_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.login_screen.*
import kotlinx.android.synthetic.main.register_screen.*

class Register_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_screen)

        btnNext.setOnClickListener {
            val intent= Intent(this@Register_Screen,Customer_Info1::class.java)
            startActivity(intent)
        }
    }
}