package com.example.movieapp.ui.login

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.movieapp.R
import com.example.movieapp.ui.MainActivity


class LoginActivity : AppCompatActivity() {


    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.d("Daniel","Mensaje entro a pantalla1")
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) //delay 3 seconds to open main activity
    }
}