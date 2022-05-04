package com.udacity.asteroidradar.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "asteroids")
data class AsteroidEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,

    @ColumnInfo(name = "asteroid_name")
    var name: String,

    @ColumnInfo(name = "asteroid_close_approach_date")
    var close_approach_date: String,

    @ColumnInfo(name = "asteroid_close_approach_date_full")
    var close_approach_date_full: String,

    @ColumnInfo(name = "asteroid_absolute_magnitude")
    var absolute_magnitude: Long = 0L,

    @ColumnInfo(name = "asteroid_estimated_diameter_max")
    var estimated_diameter_max: Long = 0L,

    @ColumnInfo(name = "asteroid_is_potentially_hazardous")
    var is_potentially_hazardous: Boolean = false,

    @ColumnInfo(name = "asteroid_close_approach_data")
    var close_approach_data: String,

    @ColumnInfo(name = "asteroid_relative_velocity")
    var relative_velocity: String,

    @ColumnInfo(name = "asteroid_kilometers_per_second")
    var kilometers_per_second: Long = 0L,

    @ColumnInfo(name = "asteroid_miss_distance")
    var miss_distance: Long = 0L,

    @ColumnInfo(name = "asteroid_astronomical")
    var astronomical: Long = 0L,

    @ColumnInfo(name = "asteroid_distance_from_earth")
    var distance_from_earth: Long = 0L,

    @ColumnInfo(name = "asteroid_image_url")
    var image_url: String,

    @ColumnInfo(name = "asteroid_media_type")
    var media_type: Boolean,

    @ColumnInfo(name = "asteroid_media_title")
    var image_title: String

)