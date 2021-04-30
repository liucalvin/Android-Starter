package com.example.android_starter.repository

import com.example.android_starter.db.ExampleDatabase

interface ExampleRepository

class ExampleRepositoryImpl(private val exampleDatabase: ExampleDatabase) : ExampleRepository
