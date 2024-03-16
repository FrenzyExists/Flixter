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

}