package com.example.exercise2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

class GenerateRandomInt : Activity(){
    private var upperBound = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        upperBound = intent.getIntExtra("upperBound", upperBound)

    }

    fun generateRandomInt(v: View?) {
        upperBound = (0..upperBound).random()
        setResult(RESULT_OK, Intent().putExtra("upperBound", upperBound))
        finish()
    }
}