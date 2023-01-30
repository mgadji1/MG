package com.bignerdrach.android.mg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var n = ""
    var res = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun input0(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "0"
        textCount.text = n
    }

    fun input1(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "1"
        textCount.text = n
    }

    fun input2(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "2"
        textCount.text = n
    }

    fun input3(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "3"
        textCount.text = n
    }

    fun input4(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "4"
        textCount.text = n
    }

    fun input5(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "5"
        textCount.text = n
    }

    fun input6(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "6"
        textCount.text = n
    }

    fun input7(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "7"
        textCount.text = n
    }

    fun input8(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "8"
        textCount.text = n
    }

    fun input9(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n += "9"
        textCount.text = n
    }

    fun plus(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        res += n.toInt()
        n = ""
        textCount.text = ""
    }

    fun clear(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        n = ""
        res = 0
        textCount.text = ""
    }

    fun result(view: View){
        val textCount:TextView = findViewById(R.id.textView)
        res += n.toInt()
        n = 0.toString()
        textCount.text = ""
        textCount.text = "$res"
    }

}
