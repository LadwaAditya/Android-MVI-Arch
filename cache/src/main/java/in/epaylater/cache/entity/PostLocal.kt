package `in`.epaylater.cache.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "post")
data class PostLocal(@PrimaryKey val id: Int,
                     val userId: Int,
                     val title: String,
                     val body: String)