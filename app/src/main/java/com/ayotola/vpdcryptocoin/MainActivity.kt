package com.ayotola.vpdcryptocoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.ayotola.vpdcryptocoin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listView = binding.coinListView

//        val coinList = Coin.getRecipesFromFile("recipes.json", this)
//        val listItems = arrayOfNulls<String>(coinList.size)
//        for (i in 0 until coinList.size) {
//            val coin = coinList[i]
//            listItems[i] = recipe.title
//        }
//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
//        listView.adapter = adapter

    }
}