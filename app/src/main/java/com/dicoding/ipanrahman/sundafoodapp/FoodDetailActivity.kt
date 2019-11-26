package com.dicoding.ipanrahman.sundafoodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 * @author Ipan Taupik Rahman.
 */
class FoodDetailActivity : AppCompatActivity() {

    lateinit var mTvTitle: TextView
    lateinit var mTvDescription: TextView
    lateinit var mIvPhoto: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true);
        supportActionBar?.setHomeButtonEnabled(true);
        supportActionBar?.title = getString(R.string.food_detail)

        mTvTitle = findViewById(R.id.tv_title)
        mTvDescription = findViewById(R.id.tv_description)
        mIvPhoto = findViewById(R.id.iv_photo)

        val bundle: Bundle? = intent.extras
        mTvTitle.text = bundle!!.getString("food.title")
        mTvDescription.text = bundle.getString("food.description")
        Glide.with(this)
            .load(bundle.getInt("food.photo", 0))
            .apply(RequestOptions().override(350, 550))
            .into(mIvPhoto)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
