package `in`.epaylater.data.repository

import `in`.epaylater.cache.entity.PostLocal
import `in`.epaylater.data.DataManager
import `in`.epaylater.domain.model.Post
import `in`.epaylater.domain.repository.Repository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class PostDataRepository @Inject
constructor(private val dataManager: DataManager) : Repository<List<Post>> {
    override fun clear(): Completable {
        return Completable.fromAction { dataManager.deleteAllLocalPosts() }
    }
    
    override fun save(item: List<Post>): Completable {
        val postList = item
            .asSequence()
            .map { PostLocal(it.id, it.userId, it.title, it.body) }
            .toList()
        return Completable.fromAction { dataManager.saveLocalPosts(postList) }
    }
    
    override fun get(): Single<List<Post>> = dataManager.posts
}