package com.example.meteoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Process_Image_Main : AppCompatActivity() {

    private lateinit var processimage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_process_image_main)


        processimage = findViewById(R.id.imageView)
        processimage.alpha =0.5f // determina la luminosità o opacità del splashcreen compreso tra 0 e 1
        processimage.animate().setDuration(5000).alpha(1f).withEndAction {
            val intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}