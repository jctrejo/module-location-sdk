package com.android.locationsdk.util

import android.content.Context
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

fun ImageView.colorImage(color: Int, context: Context) {
    this.setColorFilter(
        ContextCompat.getColor(context, color),
        android.graphics.PorterDuff.Mode.SRC_IN
    )
}

fun ImageView.glide(image: Int) {
    context?.let {
        Glide.with(it)
            .load(image)
            .into(this)
    }
}