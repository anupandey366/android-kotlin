package com.example.japan_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.choose_user.*

class Choose_User : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_user)

        rbExist.setOnClickListener {
            val intent= Intent(this@Choose_User,Choose_Account::class.java)
            startActivity(intent)
        }

        rbNewUser.setOnClickListener {
            val intent= Intent(this@Choose_User,Login_Screen::class.java)
            startActivity(intent)
        }
    }
}