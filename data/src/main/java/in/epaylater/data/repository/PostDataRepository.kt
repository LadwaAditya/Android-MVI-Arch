package `in`.epaylater.data.repository

import `in`.epaylater.cache.entity.PostLocal
import `in`.epaylater.data.DataManager
import `in`.epaylater.domain.repository.Repository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

class PostDataRepository @Inject
constructor(private val dataManager: DataManager) : Repository<List<PostLocal>> {
    override fun clear(): Completable {
        return Completable.fromAction { dataManager.deleteAllLocalPosts() }
    }
    
    override fun save(item: List<PostLocal>): Completable {
        return Completable.fromAction { dataManager.saveLocalPosts(item) }
    }
    
    override fun get(): Single<List<PostLocal>> {
        return if (dataManager.getPostCount() == 0) {
            dataManager.posts.map {
                it.map {
                    PostLocal(it.id, it.userId, it.title, it.body)
                }.toList()
            }.doOnSuccess { save(it) }
        } else {
            dataManager.getLocalPosts()
        }
    }
}