package it.morrillo.numberguess

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var casual = (1 until 10).random()

        var attempt: Int = 0;
        var n: Int = 0;


        number.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
            }

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                if (s.toString() == "") return
                var num = s.toString().toInt();
                n = num;
            }
        })

        fab.setOnClickListener { view ->

            if (n < 1 || n > 10 && n != casual)
                Snackbar.make(view, "Numero out of range", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
            if (n == casual) {
                Snackbar.make(view, "Numero esatto.", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
                attempt = 0;
                casual = (1 until 10).random();
            }else{
                attempt++
                attemptText.setText("Numero tentativi: " + attempt)
            }
        }
    }

}
