package com.hasura.rania.myblog;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by rania on 8/22/2017.
 */

public interface ApiInterface {
    @POST(NetworkURL.LOGIN)
    Call<MessageResponse> login(@Body AuthenticationRequest body );
    @POST(NetworkURL.REGISTERATION)
    Call<MessageResponse> registeration(@Body AuthenticationRequest body );

    @GET(NetworkURL.GET_ARTICLES)
    Call<List<Article>> getArticles();

    @GET(NetworkURL.LOGOUT)
    Call<Void> logout();

}
