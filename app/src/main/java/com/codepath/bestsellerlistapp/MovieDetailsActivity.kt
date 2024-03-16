package com.codepath.bestsellerlistapp


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.gson.Gson
import org.w3c.dom.Text


class MovieDetailsActivity : YouTubeBaseActivity() {
    private lateinit var receivedMovie: LatestMovies
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val mMovieTitle = findViewById<TextView>(R.id.textMovieTitle)

        val intent = intent

        // Get the JSON string from the intent
        val movieJson = intent.getStringExtra(MOVIE_EXTRA)
        val mGoBack = findViewById<ImageView>(R.id.goBack)

        // Convert the JSON string back to a LatestMovies object using Gson
        val gson = Gson()
        receivedMovie = gson.fromJson(movieJson, LatestMovies::class.java)
        Log.v("EEDE", receivedMovie.toString());
        Log.v("EEDE", receivedMovie.title.toString());

        mMovieTitle.text = receivedMovie.title.toString()

        mGoBack.setOnClickListener {
            onBackPressed()
        }
    }

}