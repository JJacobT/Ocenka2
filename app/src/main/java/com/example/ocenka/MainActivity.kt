package com.example.ocenka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nazwa = findViewById<TextView>(R.id.textView2)

        var obrazek = 1;
        findViewById<Button>(R.id.btn_p).setOnClickListener {
            if (obrazek == 1)
                obrazek = 5;

            else
                obrazek -= 1;
            if (obrazek == 1)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.dom);
            else if (obrazek == 2)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.auto);
            else if (obrazek == 3)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies);
            else if (obrazek == 4)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot);
            else if (obrazek == 5)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.resource_super);
        }
        findViewById<Button>(R.id.btn_n).setOnClickListener {
            if (obrazek == 5)
                obrazek = 1;
            else
                obrazek += 1;
            if (obrazek == 1)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.dom);
            else if (obrazek == 2)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.auto);
            else if (obrazek == 3)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies);
            else if (obrazek == 4)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot);
            else if (obrazek == 5)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.resource_super);
        }


        val obrazekid = findViewById<ImageView>(R.id.obrazek)
        val zaznNiewidzialnosci = findViewById<CheckBox>(R.id.check_w)
        val zaznPrzezroczystosci = findViewById<CheckBox>(R.id.check_p)
        val wartoscPrzezroczystosci = findViewById<EditText>(R.id.wartosc)
        val przeroczystoscButton = findViewById<Button>(R.id.btn_p)

        zaznNiewidzialnosci.setOnClickListener {
            if (zaznNiewidzialnosci.isChecked) {
                obrazekid.visibility = View.INVISIBLE
            } else {
                obrazekid.visibility = View.VISIBLE
            }
        }
        zaznPrzezroczystosci.setOnClickListener {
            wartoscPrzezroczystosci.isEnabled = zaznPrzezroczystosci.isChecked
        }
        przeroczystoscButton.setOnClickListener {
            val przezroczystoscLiczba = wartoscPrzezroczystosci.text.toString().toFloat()
            obrazekid.alpha = przezroczystoscLiczba
        }


    }
        }


