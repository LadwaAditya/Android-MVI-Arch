package `in`.epaylater.data

import `in`.epaylater.cache.DatabaseService
import `in`.epaylater.cache.entity.PostLocal
import `in`.epaylater.domain.model.Post
import `in`.epaylater.remote.RemoteService
import io.reactivex.Single
import javax.inject.Inject

class AppDataManager
@Inject constructor(private val remoteService: RemoteService,
                    private val databaseService: DatabaseService) : DataManager {
    
    override val posts: Single<List<Post>> get() = remoteService.posts
    override fun getLocalPosts(): Single<List<PostLocal>> = databaseService.getLocalPosts()
}