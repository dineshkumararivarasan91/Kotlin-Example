package dk.project.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    private val name :String = "Welcome to Kotlin World"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMe : TextView = findViewById(R.id.click_me)

        clickMe.text = "Click Me To Display Message"

        clickMe.setOnClickListener { clickMe.text = name }
    }
}