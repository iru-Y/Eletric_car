package com.example.eletricCar.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eletriccar.R

class CalcularAutonomiaActivity : AppCompatActivity() {

    private lateinit var price: EditText
    private lateinit var km: EditText
    private lateinit var btnCalc: Button
    private lateinit var tvResult: TextView
    private lateinit var btnBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListeners()
    }

    private fun setupView(){
        this.price = findViewById(R.id.et_preco_kwh)
        this.km = findViewById(R.id.et_km_percorrido)
        this.btnCalc = findViewById(R.id.btn_calcular)
        this.tvResult = findViewById(R.id.ed_result)
        this.btnBack = findViewById(R.id.iv_close_calc)
    }
    private fun setupListeners() {
        this.btnCalc.setOnClickListener {
            calc()
        }
        this.btnBack.setOnClickListener() {
        finish()
        }
    }
    private fun calc(){
        val price = this.price.text.toString().toFloat()
        val km = this.km.text.toString().toFloat()
        val result = price / km
        tvResult.text = String.format("%.2f", result).replace(",", ".")
    }
}