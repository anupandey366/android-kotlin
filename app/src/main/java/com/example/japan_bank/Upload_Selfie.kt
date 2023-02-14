package com.example.japan_bank

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.customer_info1.*
import kotlinx.android.synthetic.main.customer_info1.btnNext
import kotlinx.android.synthetic.main.upload_selfie.*

class Upload_Selfie : AppCompatActivity() {
//    private val cameraRequest = 1888
//    lateinit var imageView: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.upload_selfie)

        ivSelfie.setOnClickListener {
            onLogin(View(this))
        }

        btnNext.setOnClickListener {
            val intent = Intent(this@Upload_Selfie, Contact_Info::class.java)
            startActivity(intent)
        }

//        imageView = findViewById(R.id.ivSelfie)
//        val photoButton: ImageView = findViewById(R.id.ivSelfie)
//        photoButton.setOnClickListener {
//            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            startActivityForResult(cameraIntent, cameraRequest)
//        }
    }
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == cameraRequest) {
//            val photo: Bitmap = data?.extras?.get("data") as Bitmap
//            imageView.setImageBitmap(photo)
//        }
//    }
    fun onLogin(view: View) {
        MyCustomDialog().show(supportFragmentManager, "MyCustomFragment")
    }
}
