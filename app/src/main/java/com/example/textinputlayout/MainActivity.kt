package com.example.textinputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Spr).setOnClickListener {
            val haslo1 = findViewById<TextInputLayout>(R.id.Haslo)
            val haslo2 = findViewById<TextInputLayout>(R.id.PHaslo)
                if(haslo1 == haslo2)

        }

    }
}