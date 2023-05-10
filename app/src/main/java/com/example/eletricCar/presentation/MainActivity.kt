package com.example.eletricCar.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.eletriccar.R

class MainActivity : AppCompatActivity() {

    lateinit var calcularPreco: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    private fun setupView(){
        calcularPreco= findViewById(R.id.btn_puxar_calcular)
    }
    private fun setupListeners(){
        this.calcularPreco.setOnClickListener() {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}