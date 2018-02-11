package `in`.epaylater.cache.dao

import `in`.epaylater.cache.entity.PostLocal
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Single

@Dao
interface PostDao {
    @Query("SELECT * FROM post")
    fun getLocalPosts(): Single<List<PostLocal>>
}