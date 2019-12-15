package com.example.moviedatabase;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    @GET("jam.php")
    Call<Post> getPost(
            @Query("apikey") String apikey,
            @Query("id") String id
    );

//    @GET("posts/{id}/comments")
//    Call<List<Comment>> getComment(@Path("id") int postId);
//
//    @GET
//    Call<List<Comment>> getComment(@Url String Url);
}