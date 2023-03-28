package com.example.fitbitproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.codepath.articlesearch.inputActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton = findViewById<Button>(R.id.enterFood)
        val foodInput = findViewById<EditText>(R.id.enterFoodName)
        val calorieInput = findViewById<EditText>(R.id.enterFoodCalories)
        val newInputButton = findViewById<Button>(R.id.enterNew)


        newInputButton.setOnClickListener(){
            startActivity(Intent(this, inputActivity::class.java)
                .putExtra("key", "value"))
        }




    }
}