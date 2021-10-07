package com.ayotola.vpdcryptocoin

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ayotola.vpdcryptocoin.databinding.ActivityConversionBinding

class ConversionActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var binding: ActivityConversionBinding
    var coins = arrayOf<String>("BTC", "ETH", "XRP", "Dogecoin", "Dash", "Litecoin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val spin = binding.spinner
        val spinner = binding.spinner2

        spin.onItemSelectedListener = this

        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(this, R.layout.simple_spinner_item, coins)

        ad.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)

        spin.adapter = ad


        spinner.onItemSelectedListener = this

        val adver: ArrayAdapter<*> = ArrayAdapter<Any?>(this, R.layout.simple_spinner_item, coins)

        adver.setDropDownViewResource(R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adver
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {

        Toast.makeText(applicationContext, coins[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {}
}