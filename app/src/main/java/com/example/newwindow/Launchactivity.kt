package com.example.newwindow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class Launchactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launchactivity)
        val timer = object : CountDownTimer(  3000, 1000){
            override fun onTick(millisUnitFinished: Long){

            }

            override fun onFinish() {
                val intent= Intent(this@Launchactivity,MainActivity::class.java)
                startActivity(intent)
                finish()
            }



        }
        timer.start()
    }
}