package com.example.eletricCar.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.eletricCar.presentation.data.CarFactory
import com.example.eletricCar.presentation.models.Car
import com.example.eletricCar.presentation.ui.adapter.CarAdapter
import com.example.eletriccar.R

class MainActivity : AppCompatActivity() {

    lateinit var calcPrice: Button
    lateinit var listCar: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
        setupList()
    }

    private fun setupView(){
        calcPrice= findViewById(R.id.btn_puxar_calcular)
        listCar= findViewById(R.id.rvListCar)
    }
    private fun setupListeners(){
        this.calcPrice.setOnClickListener() {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
    private fun setupList() {
        val adapter = CarAdapter(CarFactory.list)
        listCar.adapter = adapter
    }
}