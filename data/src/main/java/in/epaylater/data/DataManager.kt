package `in`.epaylater.data

import `in`.epaylater.cache.DatabaseService
import `in`.epaylater.remote.RemoteService

interface DataManager : RemoteService, DatabaseService