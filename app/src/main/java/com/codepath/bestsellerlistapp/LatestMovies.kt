package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class LatestMovies {
    @SerializedName("id")
    var id = -1

    @SerializedName("original_title")
    var title: String? = null

    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("release_date")
    var release_date: String? = null

    @SerializedName("poster_path")
    var poster: String? = null

//    @SerializedName("rank")
//    var rank = 0
//
//    @JvmField
//    @SerializedName("title")
//    var title: String? = null
//
//    @JvmField
//    @SerializedName("author")
//    var author: String? = null
//
//    @JvmField
//    @SerializedName("book_image")
//    var bookImageURL: String? = null
//
//    @JvmField
//    @SerializedName("description")
//    var description: String? = null
//
//    @JvmField
//    @SerializedName("amazon_product_url")
//    var amazonURL: String? = null
}