package com.example.android_starter.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "example_database")
data class Example(
    @PrimaryKey
    val id: Long,
    @ColumnInfo(name = "example_name")
    val example: String
)