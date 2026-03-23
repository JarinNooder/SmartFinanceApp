package com.example.smartfinanceapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<Button>(R.id.btnAddTransaction)
        val btnHistory = findViewById<Button>(R.id.btnViewHistory)

        btnAdd.setOnClickListener {
            Toast.makeText(this, "Add Transaction Clicked", Toast.LENGTH_SHORT).show()
        }

        btnHistory.setOnClickListener {
            Toast.makeText(this, "View History Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}