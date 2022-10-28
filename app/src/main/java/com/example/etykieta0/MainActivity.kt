package com.example.etykieta0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonTekst).setOnClickListener {
            var text1 = findViewById<TextView>(R.id.textViewEtykieta).text.toString();
            var text2 = findViewById<EditText>(R.id.editTekst).text.toString();
            findViewById<TextView>(R.id.textViewEtykieta).text = text1+ " " + text2;
        }
        findViewById<Button>(R.id.buttonImNaz).setOnClickListener {
            findViewById<TextView>(R.id.textViewEtykieta).text = " Kacper Piątkowski ";
        }
    }
}