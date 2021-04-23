package com.example.android_starter.repository

import com.example.android_starter.db.Example
import com.example.android_starter.db.ExampleDatabase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first

interface ExampleRepository {

    suspend fun get(): Flow<List<Example>>

    suspend fun insert()

}

class ExampleRepositoryImpl(private val exampleDatabase: ExampleDatabase) : ExampleRepository {

    override suspend fun get(): Flow<List<Example>> {
        return MutableStateFlow(exampleDatabase.exampleDao().getAll().first())
    }

    override suspend fun insert() {

    }


}
