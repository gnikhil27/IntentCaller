package nik.iant.intentcaller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Calc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(android.R.style.Theme_DeviceDefault_NoActionBar_Fullscreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
    }
}