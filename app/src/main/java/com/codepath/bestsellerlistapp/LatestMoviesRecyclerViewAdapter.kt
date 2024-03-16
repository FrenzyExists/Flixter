package com.codepath.bestsellerlistapp

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codepath.bestsellerlistapp.R.id
import com.google.gson.Gson

/**
 * [RecyclerView.Adapter] that can display a [LatestMovies] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 */

const val MOVIE_EXTRA = "MOVIE_EXTRA"
private val getImgURL = "https://image.tmdb.org/t/p/w500"
class LatestMoviesRecyclerViewAdapter(
    private val context : Context?,
    private val latestMovies: List<LatestMovies>?,
    private val mListener: OnListFragmentInteractionListener?
    )
    : RecyclerView.Adapter<LatestMoviesRecyclerViewAdapter.MoviesViewHolder>()
    {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_best_seller_book, parent, false)
        return MoviesViewHolder(view)
    }

    /**
     * This inner class lets us refer to all the different View elements
     * (Yes, the same ones as in the XML layout files!)
     */
    inner class MoviesViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {

        var mItem: LatestMovies? = null
        val mMovieTitle: TextView = mView.findViewById<View>(id.book_title) as TextView
        val mBookAuthor: TextView = mView.findViewById<View>(id.movie_release_date) as TextView


        // Step 4
        val mMovieOverview: TextView = mView.findViewById<View>(id.movie_overview) as TextView
        val mBookURLImage: ImageView = mView.findViewById<View>(id.book_image) as ImageView
        val mBookBuy: Button = mView.findViewById<View>(id.buy_button) as Button

        override fun toString(): String {
            return mMovieTitle.toString() + " '" + mBookAuthor.text.toString() + "'"
        }
    }

    /**
     * This lets us "bind" each Views in the ViewHolder to its' actual data!
     */
    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = latestMovies?.get(position)
        Log.v("ADAPTER DATA BOOKS", movie.toString())
        holder.mItem = movie
        if (movie != null) {
            holder.mMovieTitle.text = movie.title
            holder.mMovieOverview.text = movie.overview
            Glide.with(holder.mView)
                .load(getImgURL+ movie.poster)
                .centerInside()
                .into(holder.mBookURLImage)

        }

        holder.mView.setOnClickListener {
            val m = latestMovies?.get(position)
            m?.let {
                val gson = Gson()
                val movieJson = gson.toJson(m)

                val intent = Intent(context, MovieDetailsActivity::class.java)
                intent.putExtra(MOVIE_EXTRA, movieJson) // Pass movie object as JSON string
                context?.startActivity(intent)
            }
        }

        holder.mBookBuy.setOnClickListener {

        }
    }


    /**
     * Remember: RecyclerView adapters require a getItemCount() method.
     */
    override fun getItemCount(): Int {
        return latestMovies?.size ?: 0
    }
}