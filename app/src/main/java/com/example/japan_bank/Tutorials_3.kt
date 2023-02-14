package com.example.japan_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tutorials1.*
import kotlinx.android.synthetic.main.tutorials3.*

class Tutorials_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tutorials3)

        ivDot111.setOnClickListener {
            val intent= Intent(this@Tutorials_3,Tutorials_1::class.java)
            startActivity(intent)
        }

        ivDot222.setOnClickListener {
            val intent= Intent(this@Tutorials_3,Tutorial_2::class.java)
            startActivity(intent)
        }

        ivN2.setOnClickListener {
            val intent= Intent(this@Tutorials_3,Tutorial_2::class.java)
            startActivity(intent)
        }

        ivNext.setOnClickListener {
            val intent= Intent(this@Tutorials_3,Select_Language::class.java)
            startActivity(intent)
        }

        btnSkipDM.setOnClickListener {
            val intent= Intent(this@Tutorials_3,Select_Language::class.java)
            startActivity(intent)
        }

    }
}