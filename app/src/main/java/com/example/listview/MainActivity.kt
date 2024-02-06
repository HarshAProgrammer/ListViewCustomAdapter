package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var arrayListOf: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name = arrayOf("Saumya", "Harsh", "Ankit", "Pradeep", "Aman")
        val lastMsg = arrayOf("Hey, how are you", "Good", "Awesome", "Cool", "Let's meet up")
        val lastTime = arrayOf("6:25 AM", "8:29 AM", "8:39 AM", "8:29 PM", "12:29 AM")
        val phoneNumber = arrayOf("121345677", "129084177", "2156465677", "1213434244", "312445667")
        val imgID = intArrayOf(
            R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5
        )

        arrayListOf = ArrayList()

        for(index in name.indices){
            val user = User(name[index],lastMsg[index],phoneNumber[index],lastTime[index],imgID[index])
            arrayListOf.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this,arrayListOf)

        listView.setOnItemClickListener { parent, view, position, id ->
            // open a new activity

            val userName =name[position]
            val userPhone = phoneNumber[position]
            val imgID = imgID[position]

            val i = Intent(this, UserActivity::class.java)
            i.putExtra("Name",userName)
            i.putExtra("Phone",userPhone)
            i.putExtra("Image",imgID)
            startActivity(i)

        }


    }
}