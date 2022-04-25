package com.beyzanur.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_nextactivity.*

class Nextactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nextactivity)

        

   val intent = intent
       val username = intent.getStringExtra("username") // get getirdi.
       val name = intent.getStringExtra("name")


        userNameTextNextActivity.text = "Usernama : " + username
        nameTextNextActivity.text= "Name : "+ name


    }


}