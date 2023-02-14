package com.example.japan_bank


import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.japan_bank.Countries.list
import kotlinx.android.synthetic.main.customer_info1.*
import kotlinx.android.synthetic.main.login_screen.*
import java.util.*
import java.util.Calendar.*
import java.util.Calendar.getInstance as getInstance1

class Customer_Info1 : AppCompatActivity() {

    lateinit var dateEdt: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customer_info1)

        setupCustomSpinner()

        btnNext.setOnClickListener {
            val intent = Intent(this@Customer_Info1, Customer_Info2::class.java)
            startActivity(intent)
        }

        dateEdt = findViewById(R.id.idEdtDate)

        dateEdt.setOnClickListener {
            val c = getInstance1()

            val year = c.get(YEAR)
            val month = c.get(MONTH)
            val day = c.get(DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog( this,
                { view, year, monthOfYear, dayOfMonth ->
                    val dat = (dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year)
                    dateEdt.setText(dat)
                }, year, month, day)
            datePickerDialog.show()
        }

    }

    private fun setupCustomSpinner() {
        val adapter = CountryArrayAdapter(this, list!!)
        customSpinner.adapter = adapter
    }
}