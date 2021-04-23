package com.example.android_starter.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ExampleDao {

    @Query("SELECT * FROM example_database")
    fun getAll(): Flow<List<Example>>

    @Insert()
    suspend fun insert(example: Example)

}