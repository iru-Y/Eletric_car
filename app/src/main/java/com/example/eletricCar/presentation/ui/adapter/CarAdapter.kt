package com.example.eletricCar.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eletricCar.presentation.models.Car
import com.example.eletriccar.R
import org.w3c.dom.Text

class CarAdapter(private val carList: List<Car>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_card_car,
            parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = carList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.price.text = carList[position].price
        holder.batter.text = carList[position].batter
        holder.potency.text = carList[position].potency
        holder.recharge.text = carList[position].recharge
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val price: TextView
        val batter: TextView
        val potency: TextView
        val recharge: TextView

        init {
            view.apply {
                price = findViewById(R.id.tv_preco_value)
                batter = findViewById(R.id.tv_bateria_value)
                potency = findViewById(R.id.tv_potencia_value)
                recharge = findViewById(R.id.tv_recarga_value)
            }
        }
    }
}
