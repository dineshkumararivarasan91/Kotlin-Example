package dk.project.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonClickDisplayImage : Button = findViewById(R.id.btn_clickme)
        val imageViewDisplay : ImageView = findViewById(R.id.imageview_display)

        buttonClickDisplayImage.setOnClickListener { imageViewDisplay.setImageResource(R.drawable.kotlinlogo) }
    }
}