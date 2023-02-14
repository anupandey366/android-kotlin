package com.example.japan_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.select_language.*
import kotlinx.android.synthetic.main.tutorials3.*

class Select_Language : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_language)

        btnNext.setOnClickListener {
            val intent= Intent(this@Select_Language,Choose_User::class.java)
            startActivity(intent)
        }

        btnSkipLan.setOnClickListener {
            val intent= Intent(this@Select_Language,Choose_User::class.java)
            startActivity(intent)
        }
    }
}