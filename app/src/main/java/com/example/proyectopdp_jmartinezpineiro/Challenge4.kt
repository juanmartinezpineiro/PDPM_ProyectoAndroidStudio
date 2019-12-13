package com.example.proyectopdp_jmartinezpineiro

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_challenge4.*
import org.jetbrains.anko.browse

class Challenge4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge4)

        btnVisitar.setOnClickListener{
            browse("http://www.danielcastelao.org/")
            setResult(Activity.RESULT_OK)
            finish()

        }


    }
}
