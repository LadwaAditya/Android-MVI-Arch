package `in`.epaylater.remote

import `in`.epaylater.domain.model.Post
import io.reactivex.Single
import retrofit2.http.GET

interface RemoteService {
    @get:GET("/posts")
    val posts: Single<List<Post>>
}
