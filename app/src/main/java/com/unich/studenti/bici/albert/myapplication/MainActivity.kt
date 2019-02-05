package com.unich.studenti.bici.albert.myapplication

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.util.Observer

class MainActivity : AppCompatActivity() {

    var numeroRandom = (1..3).random()
    var attempt = 0

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inserimento: EditText = findViewById(R.id.editText) as EditText
        val bottone: Button = findViewById<Button>(R.id.button) as Button



        bottone.setOnClickListener {

            if (Integer.parseInt(inserimento.text.toString()) < 1 || Integer.parseInt(inserimento.text.toString()) > 10){

                val ris: TextView = findViewById(R.id.textViewCorretto)
                ris.text = "OUT OF RANGE"

            }else{
                attempt++
                if (Integer.parseInt(inserimento.text.toString()) == numeroRandom){

                    val ris: TextView = findViewById(R.id.textViewCorretto)
                    ris.text = "CORRETTO in $attempt"
                    val model = ViewModelProviders.of(this).get(MyViewModel::class.java)
                    model.getInserimento().observe(this, android.arch.lifecycle.Observer { inserimento ->

                        attempt = 0


                        // update UI
                    })

                    numeroRandom = (1..3).random()





                }else{
                    val ris: TextView = findViewById(R.id.textViewCorretto)
                    ris.text = "SBAGLIATO"

                }

            }



        }





    }
}
