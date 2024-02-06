package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("Name")
        val phoneNumber = intent.getStringExtra("Phone")
        val imageId = intent.getIntExtra("Image",R.drawable.pic2)

        val nameTv = findViewById<TextView>(R.id.tvUsername)
        val phoneTv = findViewById<TextView>(R.id.tvPhone)
        val imageIv = findViewById<CircleImageView>(R.id.profileIv)


        nameTv.text = name
        phoneTv.text = phoneNumber
        imageIv.setImageResource(imageId)




    }
}