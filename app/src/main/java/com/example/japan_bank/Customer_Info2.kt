package com.example.japan_bank

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.japan_bank.databinding.CustomerInfo2Binding
import kotlinx.android.synthetic.main.customer_info1.*

class Customer_Info2 : AppCompatActivity() {

    lateinit var binding: CustomerInfo2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CustomerInfo2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceButton(IDCard())

        binding.rbID.setOnClickListener {
            replaceButton(IDCard())
        }

        binding.rbPassport.setOnClickListener {
            replaceButton(Passport())
        }

        btnNext.setOnClickListener {
            val intent = Intent(this@Customer_Info2, Upload_Selfie::class.java)
            startActivity(intent)
        }
    }

    private fun replaceButton(fragment: Fragment) {
        val buttonManager= supportFragmentManager
        val buttonTransaction= buttonManager.beginTransaction()
        buttonTransaction.replace(R.id.fragments,fragment)
        buttonTransaction.commit()

    }
}