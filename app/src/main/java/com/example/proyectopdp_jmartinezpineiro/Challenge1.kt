package com.example.proyectopdp_jmartinezpineiro

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_challenge1.*
import org.jetbrains.anko.browse

class Challenge1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge1)

        //Cogemos el dato introducido en txtRespuesta
        val respuesta = txtRespuesta.text
        //Este devuelve el valor de la respuesta, para compararla
        btnConsulta.setOnClickListener {
            val data = Intent()
            data.putExtra("respuesta", respuesta.toString())

            setResult(Activity.RESULT_OK, data)

            //La repuesta es comparada con la solucion
            finish()
        }

        // Boton donde abre el navegador para buscar la respuesta del reto
        btnConsulta.setOnClickListener {
            browse("https://www.cyberpunk.net/es/es/pre-order")
        }
    }
    }

