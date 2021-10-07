package com.ayotola.vpdcryptocoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ayotola.vpdcryptocoin.databinding.ActivityConversionBinding
import com.ayotola.vpdcryptocoin.databinding.ActivityMainBinding

class ConversionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConversionBinding
    var coins = arrayOf<String>("BTC", "ETH", "XRP", "Dogecoin", "Dash", "Litecoin")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}