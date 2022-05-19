package com.example.striva.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var mapImg: Bitmap? = null,
    var runDistance: Long = 0L,  //metres
    var caloriesBurned: Int = 0,
    var avgSpeed: Float = 0f,  //KM per H
    var time: Int = 0,
    var duration: Int = 0 //milliseconds
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
