package com.example.proyectopdp_jmartinezpineiro

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast

const val BTN_CHALLENGE1_REQUEST = 1
const val BTN_CHALLENGE2_REQUEST = 2
const val BTN_CHALLENGE3_REQUEST = 3
const val BTN_CHALLENGE4_REQUEST = 4


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Codigo que llama a la activity de la pregunta (reto1)*/
        btn_Challenge1.setOnClickListener{
            val intent = Intent(this, btn_Challenge1::class.java)
            startActivityForResult(intent, BTN_CHALLENGE1_REQUEST) //Se inicia
        }
        /*Codigo que llama a la activity de la camara, que selecciona un color, para ganar habra que sacar una foto con el color indicado (reto2)*/
        btn_Challenge2.setOnClickListener{
            val intent = Intent(this, btn_Challenge2::class.java)
            startActivityForResult(intent, BTN_CHALLENGE2_REQUEST) //Se inicia
        }

        /*Codigo que llama a la activity del calculo que pidamos (reto3)*/
        btn_Challenge3.setOnClickListener{
            val intent = Intent(this, btn_Challenge3::class.java)
            startActivityForResult(intent, BTN_CHALLENGE3_REQUEST) //Se inicia
        }

        /*Codigo que llama a la activity que todavia está en desarrollo reto4)*/
        btn_Challenge4.setOnClickListener{
            val intent = Intent(this, btn_Challenge4::class.java)
            startActivityForResult(intent, BTN_CHALLENGE4_REQUEST) //Se inicia
        }


    }
    //Los resultados de los retos se establecen en este metodo
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //Esta es la respuesta del reto numero 1
        if (requestCode == BTN_CHALLENGE1_REQUEST) {
            if (resultCode == Activity.RESULT_OK) {
                if ((data?.getStringExtra("respuesta").toString()).equals("2020")) {
                    btn_Challenge1.setBackgroundColor(Color.GREEN)//boton verde= acierto
                    toast("CORRECTO")
                } else {
                    btn_Challenge1.setBackgroundColor(Color.RED)//boton rojo= error
                    toast("INCORRECTO")
                }
            }
            btn_Challenge1.setEnabled(false)//desactivamos el reto, ya se ha realizado
        }


    }


}
