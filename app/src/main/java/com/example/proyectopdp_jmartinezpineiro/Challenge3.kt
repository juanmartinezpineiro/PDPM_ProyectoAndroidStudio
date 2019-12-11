package com.example.proyectopdp_jmartinezpineiro

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_challenge3.*

class Challenge3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge3)

        // Comprueba si el calculo es correcto
        btnCheck.setOnClickListener {
            var calculo = 4
            var respuesta = Integer.parseInt(txtResultado.text.toString())

            if (calculo == respuesta) {
                var resp = true
                val intent = Intent()
                intent.putExtra("resp", resp)
                setResult(Activity.RESULT_OK, intent)
                finish()
            } else {
                finish()
            }
        }
    }
}
