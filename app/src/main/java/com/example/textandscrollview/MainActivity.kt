package com.example.textandscrollview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      /*  val btnintent=findViewById<Button>(R.id.button)2
        btnintent.setOnClickListener {
            //open a new activity

            intent=Intent(applicationContext, secondactivity::class.java)
            startActivity(intent)*/



        val buttonwishlist=findViewById<Button>(R.id.button)

        buttonwishlist.setOnClickListener {
            Toast.makeText(applicationContext, "Added to wishlist", Toast.LENGTH_SHORT).show()

        }

        //implict functions

        val webbutton=findViewById<CardView>(R.id.web)

        webbutton.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www2.hm.com/en_in/productpage.1124657002.html")
            startActivity(intent)
        }





        }
    }
