package com.example.listview

import android.app.Activity
import android.app.Notification.Action
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(val context:Activity,val arrayList: ArrayList<User>) : ArrayAdapter<User>(context,R.layout.each_item,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater  = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_item,null)

        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.chatName)
        val lastMsg = view.findViewById<TextView>(R.id.chatLastMessage)
        val lastTime = view.findViewById<TextView>(R.id.chatLastMessageTimeStamp)


        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMessage
        lastTime.text = arrayList[position].lastTime

        image.setImageResource(arrayList[position].imageID)

        return view
    }
}