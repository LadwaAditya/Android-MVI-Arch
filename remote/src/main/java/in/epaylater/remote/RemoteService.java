package in.epaylater.remote;

import java.util.List;

import in.epaylater.domain.model.Post;
import io.reactivex.Single;
import retrofit2.http.GET;

interface RemoteService {
    @GET("/posts")
    Single<List<Post>> getPosts();
}
