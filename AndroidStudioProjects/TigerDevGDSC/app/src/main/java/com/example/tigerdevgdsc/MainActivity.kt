package com.example.tigerdevgdsc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val imageView1 = findViewById<ImageView>(R.id.imageView1)
    var imageView2 = findViewById<ImageView>(R.id.imageView2)






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView1.setOnClickListener(){
            Toast.makeText(this,"Heloooo",Toast.LENGTH_LONG).show()
        }


    }



}


