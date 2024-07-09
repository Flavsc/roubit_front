package com.example.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.model.DataEntity

@Database(entities = [DataEntity::class], version = 1)
abstract class Database : RoomDatabase() {
    
}
