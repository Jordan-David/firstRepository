package com.example.imadassignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //Declaring variables
    //an app that provides social interaction suggestions based on the user's time of day


    //Declaring variables
    private lateinit var edtTimeOfDay:EditText
    private lateinit var btnReset: Button
    private lateinit var tvResult: TextView
    private lateinit var btnCheck: Button




    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //connect the variable to xml components (typecasting)
        edtTimeOfDay = findViewById(R.id.edtTimeOfDay)
        btnReset = findViewById(R.id.btnReset)
        tvResult = findViewById(R.id.tvResult)
        btnCheck = findViewById(R.id.btnCheck)






        //adding the button click listner
        btnCheck.setOnClickListener {
            //If statements
            val timeOfDay = edtTimeOfDay.text.toString().trim().lowercase()
            tvResult.text = ""


            if (timeOfDay == "morning") {
                tvResult.text = "Send a 'Good Morning!'to a family member"


            } else if (timeOfDay == "mid-morning") {
                tvResult.text = "Reach out to a colleague with a quick 'Thank you'"
            } else if (timeOfDay == "afternoon") {
                tvResult.text = "Share a funny meme or an interesting link to a friend"


            } else if (timeOfDay == "after snack time") {
                tvResult.text = "Send a quick 'Thinking of you' massage to a partner or close friend"




            } else if (timeOfDay == "dinner") {
                tvResult.text = "Call a friend or relative for catching up"


            } else if (timeOfDay == "night") {
                tvResult.text = "Leave a thoughtful comment on a friends's post"


            } else if (timeOfDay == "mid-night") {
                tvResult.text = "Do a self-introspection and pray"


            } else
                tvResult.text = "Invalid time of day"




        }
        //Display the result
        tvResult.text = ""


        //Adding the second buton click listner
        btnReset.setOnClickListener {


            //Clear the EditText fields and the result
            edtTimeOfDay.text.clear()
            tvResult.text = ""




        }






















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
















        }
    }










}




