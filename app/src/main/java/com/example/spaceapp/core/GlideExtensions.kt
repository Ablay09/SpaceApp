package com.example.spaceapp.core

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

private const val IMAGE_LOAD_TIMEOUT_MS = 6000

fun ImageView.load(
    url: String,
    placeHolder: Int? = null
) {
    Glide.with(context)
        .load(url)
        .apply {
            placeHolder?.let { this.placeholder(it) }
        }
        .diskCacheStrategy(DiskCacheStrategy.DATA)
        .timeout(IMAGE_LOAD_TIMEOUT_MS)
        .into(this)
}