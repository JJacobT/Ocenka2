package com.example.ocenka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var obrazek = 1;
        findViewById<Button>(R.id.btn_p).setOnClickListener {
            if(obrazek == 1)
                obrazek = 4;
            else
                obrazek -= 1;
            if(obrazek == 1 )
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.dom);
            else if(obrazek == 2 )
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.auto);
            else if(obrazek == 3 )
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.pies);
            else if(obrazek == 4 )
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.kot);
            else if(obrazek == 5)
                findViewById<ImageView>(R.id.obrazek).setImageResource(R.drawable.resource_super);
        }
        findViewById<Button>(R.id.btn_n).setOnClickListener {
            if (obrazek == 4)
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
    }
}//

