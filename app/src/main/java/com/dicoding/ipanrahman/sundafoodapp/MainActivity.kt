package com.dicoding.ipanrahman.sundafoodapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * @author Ipan Taupik Rahman.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mRvFilms: RecyclerView
    private var foods: ArrayList<Food> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = getString(R.string.main_title)

        mRvFilms = findViewById(R.id.rv_films)
        mRvFilms.setHasFixedSize(true)

        val filmRepository = FoodRepository()
        foods.addAll(filmRepository.getListData())
        showRecyclerFilm()
    }


    private fun showRecyclerFilm() {
        mRvFilms.layoutManager = LinearLayoutManager(this)
        val foodAdapter = FoodAdapter(foods) { food: Food -> setItemOnClick(food) }
        mRvFilms.adapter = foodAdapter
    }

    private fun setItemOnClick(food: Food) {
        val foodDetailIntent = Intent(this, FoodDetailActivity::class.java)
        foodDetailIntent.putExtra("food.title", food.title)
        foodDetailIntent.putExtra("food.description", food.description)
        foodDetailIntent.putExtra("food.photo", food.photo)
        startActivity(foodDetailIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val itemId = item.itemId
        if (itemId == R.id.about) {
            startActivity(Intent(this, AboutActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }
}
