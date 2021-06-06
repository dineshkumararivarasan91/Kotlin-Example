package dk.project.button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    val welcomeMessage : String = "Welcome to Kotlin World"
    val longMessage : String = "Hi Hello, Welcome to Kotlin World!!!"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewDisplayMessage : TextView = findViewById(R.id.txt_messagedisplay)
        val buttonClickMe : Button = findViewById(R.id.btn_clickme)

        buttonClickMe.setOnClickListener { textViewDisplayMessage.text = welcomeMessage }

        buttonClickMe.setOnLongClickListener { textViewDisplayMessage.text = longMessage
            return@setOnLongClickListener true }
        
    }
}