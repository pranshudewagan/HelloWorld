package com.cs407.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView

class MainActivity : AppCompatActivity()
{
    // Declare an ImageView Variable
    private lateinit var ingView: ImageView

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}