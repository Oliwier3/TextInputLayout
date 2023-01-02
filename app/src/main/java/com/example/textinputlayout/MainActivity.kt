package com.example.textinputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  Autor: Oliwier Krauza

        findViewById<Button>(R.id.Spr).setOnClickListener {
            val haslo1 = findViewById<TextInputEditText>(R.id.Haslo).text.toString()
            val haslo2 = findViewById<TextInputEditText>(R.id.HasloP).text.toString()
                if(haslo1 == haslo2)
                    findViewById<TextView>(R.id.odp).text = "Hasła się zgadzają"
                else
                    findViewById<TextView>(R.id.odp).text = "Hasła się nie zgadzają"
        }

    }
}