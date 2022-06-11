package com.example.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget.databinding.ActivityMainBinding
import com.example.widget.databinding.ActivityWidgetBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getData = intent.getParcelableExtra<ModelLogin>("data")
        binding.txtUserName.text = getData?.username.toString()
        binding.txtPassword.text = getData?.password.toString()

        binding.btnWidget.setOnClickListener {
           val intent = Intent(this, widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener {
            val intent = Intent( this,ImplicitIntent::class.java)
            startActivity(intent)
        }
    }
}