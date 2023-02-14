package com.example.japan_bank

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.custom_dialog_fragment.*
import kotlinx.android.synthetic.main.upload_selfie.*

class Custom_Dialog_Fragment : AppCompatActivity() {

    private val cameraRequest = 1888
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.custom_dialog_fragment)

        imageView = findViewById(R.id.ivCamera)
        val photoButton: ImageView = findViewById(R.id.ivCamera)
        photoButton.setOnClickListener {
            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cameraIntent, cameraRequest)
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == cameraRequest) {
            val photo: Bitmap = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(photo)
        }
    }
    fun onLogin(view: View) {
        MyCustomDialog().show(supportFragmentManager, "MyCustomFragment")
    }
}