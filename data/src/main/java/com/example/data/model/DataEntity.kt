package com.example.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataEntity(
    @PrimaryKey val id: Int,
    val name: String
)
