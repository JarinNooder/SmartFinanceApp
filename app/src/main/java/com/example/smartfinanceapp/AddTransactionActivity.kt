package com.example.smartfinanceapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddTransactionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_transaction)

        val etTitle = findViewById<EditText>(R.id.etTitle)
        val etAmount = findViewById<EditText>(R.id.etAmount)
        val etCategory = findViewById<EditText>(R.id.etCategory)
        val etNote = findViewById<EditText>(R.id.etNote)
        val btnSave = findViewById<Button>(R.id.btnSaveTransaction)

        btnSave.setOnClickListener {
            val title = etTitle.text.toString().trim()
            val amount = etAmount.text.toString().trim()
            val category = etCategory.text.toString().trim()
            val note = etNote.text.toString().trim()

            if (title.isEmpty() || amount.isEmpty() || category.isEmpty()) {
                Toast.makeText(this, "Please fill all required fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this,
                    "Saved: $title, $$amount, $category",
                    Toast.LENGTH_SHORT
                ).show()

                etTitle.text.clear()
                etAmount.text.clear()
                etCategory.text.clear()
                etNote.text.clear()
            }
        }
    }
}