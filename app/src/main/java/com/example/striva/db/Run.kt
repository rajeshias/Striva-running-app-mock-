package com.example.striva.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var mapImg: Bitmap? = null,
    var runDistance: Long = 0L,
    var caloriesBurned: Int = 0,
    var avgSpeed: Float = 0f,
    var time: Int = 0,
    var duration: Int = 0
) {}
