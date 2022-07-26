package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init values from UI
        val ageInput = findViewById<EditText>(R.id.ageInput)
        val buttonToGetData = findViewById<Button>(R.id.calculateYearButton)
        val textToChange = findViewById<TextView>(R.id.textToChange)
        //get calendar for year
        val getCalendar = Calendar.getInstance()
        val getYear = getCalendar.get(Calendar.YEAR)

        buttonToGetData.setOnClickListener{
            val getAgeInput = ageInput.text.toString() // get input from form and convert to string
            //verify
            if(getAgeInput == "") {
                Toast.makeText(this, "You need to enter an age!", Toast.LENGTH_SHORT).show() // app crash if there is no age!
            } else {
                //display the year
                val finalCalc= getYear - Integer.parseInt(getAgeInput) // calculate year
                textToChange.text = "You are born in: $finalCalc"

            }
        }

    }

}