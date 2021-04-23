package com.example.android_starter.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Example::class], version = 1, exportSchema = false)
abstract class ExampleDatabase: RoomDatabase() {
    abstract fun exampleDao(): ExampleDao

    companion object {
        @Volatile
        private var INSTANCE: ExampleDatabase? = null

        fun getInstance(context: Context): ExampleDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ExampleDatabase::class.java,
                    "example_table"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}