package com.example.japan_bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.tutorial2.*
import kotlinx.android.synthetic.main.tutorials1.*
import kotlinx.android.synthetic.main.tutorials1.btnSkip
import kotlinx.android.synthetic.main.tutorials1.ivN1

class Tutorial_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tutorial2)

        btnSkip.setOnClickListener {
            val intent= Intent(this@Tutorial_2,Tutorials_3::class.java)
            startActivity(intent)
        }

        ivN1.setOnClickListener {
            val intent= Intent(this@Tutorial_2,Tutorials_3::class.java)
            startActivity(intent)
        }

        ivDot22.setOnClickListener {
            val intent= Intent(this@Tutorial_2,Tutorials_3::class.java)
            startActivity(intent)
        }

        ivDot11.setOnClickListener {
            val intent= Intent(this@Tutorial_2,Tutorials_1::class.java)
            startActivity(intent)
        }

        ivN2.setOnClickListener {
            val intent= Intent(this@Tutorial_2,Tutorials_1::class.java)
            startActivity(intent)
        }
    }
}