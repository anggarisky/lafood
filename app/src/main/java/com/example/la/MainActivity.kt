package com.example.la

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the component with id
        val btnExplore = findViewById<Button>(R.id.btnExplore);

        btnExplore.setOnClickListener({
            val nextPage = Intent(this, HomeActivity::class.java);
            startActivity(nextPage);
            finish();
        })

    }
}