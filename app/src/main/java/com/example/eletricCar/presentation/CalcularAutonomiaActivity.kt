package com.example.eletricCar.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccar.R

class CalcularAutonomiaActivity : AppCompatActivity() {

    private lateinit var preco: EditText
    private lateinit var km: EditText
    private lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListeners()
    }

    private fun setupView(){
        this.preco = findViewById(R.id.et_preco_kwh)
        this.km = findViewById(R.id.et_km_percorrido)
        this.btnCalcular = findViewById(R.id.btn_calcular)
    }
    private fun setupListeners(){
        this.btnCalcular.setOnClickListener{
           calc()
        }
    }
    private fun calc(){
        val textoDitado = preco.text.toString().toFloat() / km.text.toString().toFloat()
        Log.d("Texto ditado ->", textoDitado.toString())
    }
}