package com.foodshop.presentation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.foodshop.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val myButton = findViewById<Button?>(R.id.myButton)
        myButton.setOnClickListener {
            viewModel.foodResponse.observe(this) {it}
        }


    }
}