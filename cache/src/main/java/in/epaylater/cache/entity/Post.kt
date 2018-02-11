package `in`.epaylater.cache.entity

import android.arch.persistence.room.Entity

@Entity(tableName = "post")
data class Post(val id: Int,
                val userId: Int,
                val title: String,
                val body: String)