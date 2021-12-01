package com.gmail.lexxich2014.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val secret="1234"
    var current=""
    lateinit var editText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b1=findViewById<Button>(R.id.b1).apply { setOnClickListener(this@MainActivity) }
        val b2=findViewById<Button>(R.id.b2).apply { setOnClickListener(this@MainActivity) }
        val b3=findViewById<Button>(R.id.b3).apply { setOnClickListener(this@MainActivity) }
        val b4=findViewById<Button>(R.id.b4).apply { setOnClickListener(this@MainActivity) }
        val b5=findViewById<Button>(R.id.b5).apply { setOnClickListener(this@MainActivity) }
        val b6=findViewById<Button>(R.id.b6).apply { setOnClickListener(this@MainActivity) }
        val b7=findViewById<Button>(R.id.b7).apply { setOnClickListener(this@MainActivity) }
        val b8=findViewById<Button>(R.id.b8).apply { setOnClickListener(this@MainActivity) }
        val b9=findViewById<Button>(R.id.b9).apply { setOnClickListener(this@MainActivity) }
        val b0=findViewById<Button>(R.id.b0).apply { setOnClickListener(this@MainActivity) }
        editText=findViewById(R.id.edit_text)

    }

    override fun onClick(v: View?) {
        if (v==null) return
        when(v.id){
            R.id.b1->check("1")
            R.id.b2->check("2")
            R.id.b3->check("3")
            R.id.b4->check("4")
            R.id.b5->check("5")
            R.id.b6->check("6")
            R.id.b7->check("7")
            R.id.b8->check("8")
            R.id.b9->check("9")
            R.id.b0->check("0")
        }
    }

    fun check(dig: String){
        current+=dig
        editText.setText(current)
        if(current.length>=secret.length){
            if(current==secret){
                current=""
                Toast.makeText(this,"Access approve!",Toast.LENGTH_LONG).show()
            }else{
                current=""
                Toast.makeText(this,"Access denied!",Toast.LENGTH_LONG).show()
            }
            editText.setText(current)
            return
        }
    }
}