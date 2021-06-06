package dk.project.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName : EditText = findViewById(R.id.edit_name)
        val textViewDisplay : TextView = findViewById(R.id.txt_displayname)
        val buttonClickMe : Button = findViewById(R.id.btn_clickme)

        buttonClickMe.setOnClickListener {
            val getName : String = editTextName.text.toString()
            textViewDisplay.text = getName
        }
    }
}