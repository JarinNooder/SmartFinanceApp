package com.example.smartfinanceapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HistoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewTransactions)

        // Dummy data
        val list = listOf(
            Transaction("Food", "50", "Expense"),
            Transaction("Salary", "2000", "Income"),
            Transaction("Transport", "20", "Expense")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TransactionAdapter(list)
    }
}