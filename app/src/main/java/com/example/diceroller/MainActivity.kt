package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Roll.setOnClickListener { rollDice() }
    }

    private fun rollDice(){

        //Se o EditText estiver vazio ele faz o bloco if:
        if (binding.Sides.text.toString().isEmpty())
        {
            val randonInt = (1..6).random()
            val resultText = randonInt
            binding.Result.text = resultText.toString()
        }
        //Senão ele faz o bloco else:
        else
        {
            val numSides = binding.Sides.text.toString().toInt()
            val randonInt = (1..numSides).random()
            val resultText = randonInt
            binding.Result.text = resultText.toString()
        }

        val toastMsg = Toast.makeText(this, "Rolou um Dado!", Toast.LENGTH_SHORT)
        toastMsg.show()
    }
}