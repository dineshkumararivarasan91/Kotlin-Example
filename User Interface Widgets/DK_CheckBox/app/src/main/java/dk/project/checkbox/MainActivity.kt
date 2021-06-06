package dk.project.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    var  getCheckConditionText :String = ""
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkBoxTermsandCondition : CheckBox = findViewById(R.id.checkbox)
        val textViewDisplay : TextView = findViewById(R.id.txt_displayname)

        getCheckConditionText = "Terms and Conditions Not Accepted"
        textViewDisplay.text = getCheckConditionText

        checkBoxTermsandCondition.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked)
            {
                getCheckConditionText = "Terms and Conditions Accepted"
                textViewDisplay.text = getCheckConditionText
            }
            else
            {
                getCheckConditionText = "Terms and Conditions Not Accepted"
                textViewDisplay.text = getCheckConditionText
            }

        }


    }
}