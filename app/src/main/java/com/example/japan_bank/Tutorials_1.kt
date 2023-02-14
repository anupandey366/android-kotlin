package com.example.japan_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tutorials1.*

class Tutorials_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tutorials1)

        btnSkip.setOnClickListener {
            val intent=Intent(this@Tutorials_1,Tutorial_2::class.java)
            startActivity(intent)
        }

        ivDot2.setOnClickListener {
            val intent=Intent(this@Tutorials_1,Tutorial_2::class.java)
            startActivity(intent)
        }

        ivN1.setOnClickListener {
            val intent=Intent(this@Tutorials_1,Tutorial_2::class.java)
            startActivity(intent)
        }

        ivDot3.setOnClickListener {
            val intent=Intent(this@Tutorials_1,Tutorials_3::class.java)
            startActivity(intent)
        }
    }


}