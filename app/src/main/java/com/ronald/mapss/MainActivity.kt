package com.ronald.mapss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ronald.mapss.model.BbHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bdHelper = BbHelper(this)
        val db = bdHelper.writableDatabase
        Toast.makeText(this, "creada", Toast.LENGTH_SHORT).show()
    }
}