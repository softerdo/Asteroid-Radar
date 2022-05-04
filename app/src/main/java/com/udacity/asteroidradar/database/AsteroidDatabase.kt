package com.udacity.asteroidradar.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [AsteroidEntity::class], version = 1, exportSchema = true)
abstract class AsteroidDatabase : RoomDatabase(){

    //This connects the database to the DAO
    abstract val asteroidDatabaseDao: AsteroidDatabaseDao

    //Defining a companion object to add functions to the database
    companion object{

        //This INSTANCE keeps a reference to the database and avoids initializing it again
        @Volatile
        private var INSTANCE: AsteroidDatabase? = null

        fun getInstance(context: Context): AsteroidDatabase{

            //This synchronized ensures we only initialize the database once.
            synchronized(this){
                var instance = INSTANCE

                //if instance is null we create a new database instance
                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        AsteroidDatabase::class.java,
                        "asteroids"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    //INSTANCE here holds now the new database created
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}