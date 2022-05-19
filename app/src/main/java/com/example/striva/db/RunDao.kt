package com.example.striva.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

    //  Basic
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNewRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    //  Sorting
    @Query("SELECT * FROM running_table ORDER BY time DESC")
    fun getRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY runDistance DESC")
    fun getRunsSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY caloriesBurned DESC")
    fun getRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY avgSpeed DESC")
    fun getRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER BY duration DESC")
    fun getRunsSortedByDuration(): LiveData<List<Run>>

    // Aggregation
    @Query("SELECT SUM(runDistance) FROM running_table")
    fun getTotalDistance(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurned) FROM running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT AVG(avgSpeed) FROM running_table")
    fun getTotalAvgSpeed(): LiveData<Float>

    @Query("SELECT SUM(duration) FROM running_table")
    fun getTotalDuration(): LiveData<Int>
}