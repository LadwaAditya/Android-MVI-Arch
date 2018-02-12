package `in`.epaylater.domain.repository

import io.reactivex.Completable
import io.reactivex.Single

interface Repository<T> {
    fun clear(): Completable
    
    fun save(item: T): Completable
    
    fun get(): Single<T>
}