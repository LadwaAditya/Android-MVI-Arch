package `in`.epaylater.cache.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query

@Dao
interface PostDao {
    @Query("SELECT * FROM post")
    fun getPosts()
}