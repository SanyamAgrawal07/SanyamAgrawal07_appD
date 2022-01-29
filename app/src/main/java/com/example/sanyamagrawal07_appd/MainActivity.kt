package com.example.sanyamagrawal07_appd

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.submit_btn)
        val name:TextView=findViewById(R.id.name_bar)
        btn.setOnClickListener(View.OnClickListener {
            if (!name.text.toString().isEmpty()) {
                Toast.makeText(this,"you clicked submit",Toast.LENGTH_SHORT).show()
            }
        })
//        val txt:EditText=findViewById(R.id.name_bar)
//        val txt2:EditText=findViewById(R.id.age_bar)
//
//       fun clear ()

    }

    }
