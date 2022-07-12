package com.example.dinnnerpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val foodlist = arrayListOf("Chinese","Hamburger","vat-vorta","kacchi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        decidebtn.setOnClickListener{
            val random = Random
            val randomFood= random.nextInt(foodlist.count())
            selectedFoodTxt.text = foodlist[randomFood]

        }

        addFoodBtn.setOnClickListener{
            val newFoor = addFoodTxt.text.toString()
            foodlist.add(newFoor)
            addFoodTxt.text.clear()
            println(foodlist)
        }


    }
}