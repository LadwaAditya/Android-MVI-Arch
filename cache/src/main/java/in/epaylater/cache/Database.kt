package `in`.epaylater.cache

import `in`.epaylater.cache.dao.PostDao
import `in`.epaylater.cache.entity.Post
import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [Post::class], version = 1)
abstract class Database : RoomDatabase() {
    abstract fun postDao(): PostDao
}