package dk.project.switchexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchTheme : Switch  = findViewById(R.id.switch_theme)
        val textViewDisplayMessage : TextView = findViewById(R.id.txt_displayname);

        textViewDisplayMessage.text = "Switch is OFF State"

        switchTheme.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked)
            {
                textViewDisplayMessage.text = "Location Services is ON State"
            }
            else
            {
                textViewDisplayMessage.text = "Location Services is OFF State"
            }
        }
    }
}