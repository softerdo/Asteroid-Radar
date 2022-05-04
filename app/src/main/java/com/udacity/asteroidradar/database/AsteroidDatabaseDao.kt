package com.udacity.asteroidradar.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.udacity.asteroidradar.Asteroid

@Dao
interface AsteroidDatabaseDao {
    //Inserting an asteroid
    @Insert
    fun insert(asteroid: Asteroid)

    //Updating an asteroid
    @Update
    fun update(asteroid: Asteroid)

    //Deleting an asteroid
    @Delete
    fun delete(asteroid: Asteroid)

    //Selecting an asteroid based on its id
    @Query("SELECT * FROM asteroids WHERE id = :key")
    fun getAsteroid(key: Long): Asteroid

    //Getting all asteroids
    @Query("SELECT * FROM asteroids ORDER BY id DESC")
    fun getAllAsteroids(): LiveData<List<Asteroid>>
}