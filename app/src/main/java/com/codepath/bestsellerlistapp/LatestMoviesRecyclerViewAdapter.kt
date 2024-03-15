package com.codepath.bestsellerlistapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codepath.bestsellerlistapp.R.id

/**
 * [RecyclerView.Adapter] that can display a [LatestMovies] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 */

private val getImgURL = "https://image.tmdb.org/t/p/w500"
class LatestMoviesRecyclerViewAdapter(
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
        val mBookTitle: TextView = mView.findViewById<View>(id.book_title) as TextView
        val mBookAuthor: TextView = mView.findViewById<View>(id.book_author) as TextView


        // Step 4
        val mMovieOverview: TextView = mView.findViewById<View>(id.book_description) as TextView
        val mBookURLImage: ImageView = mView.findViewById<View>(id.book_image) as ImageView
        val mBookRank: TextView = mView.findViewById<View>(id.ranking) as TextView
        val mBookBuy: Button = mView.findViewById<View>(id.buy_button) as Button

        override fun toString(): String {
            return mBookTitle.toString() + " '" + mBookAuthor.text + "'"
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
            holder.mBookTitle.text = movie.title
//            holder.mBookAuthor.text = book.author
            holder.mMovieOverview.text = movie.overview
//            holder.mBookRank.text = book.rank.toString()
            Glide.with(holder.mView)
                .load(getImgURL+ movie.poster)
                .centerInside()
                .into(holder.mBookURLImage)

        }

//        holder.mBookBuy.setOnClickListener {
//            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(book?.amazonURL ?: "amazon.com"))
//            startActivity(it.context, browserIntent, null)
//        }
//
//        holder.mView.setOnClickListener {
//            holder.mItem?.let { book ->
//                mListener?.onItemClick(book)
//            }
//        }
    }

    /**
     * Remember: RecyclerView adapters require a getItemCount() method.
     */
    override fun getItemCount(): Int {
        return latestMovies?.size ?: 0
    }
}