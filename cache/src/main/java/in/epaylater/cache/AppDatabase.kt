package `in`.epaylater.cache

import `in`.epaylater.cache.dao.PostDao
import `in`.epaylater.cache.entity.PostLocal
import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = [PostLocal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun postDao(): PostDao
}