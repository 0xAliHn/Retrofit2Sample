package com.android.retrofit2sample;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by ali on 5/15/17.
 */

public interface GithubAPI {
    String ENDPOINT = "https://api.github.com";

    @GET("/issues")
    Call<List<GithubIssue>> getIssues();

    @POST
    Call<ResponseBody> postComment(@Url String url, @Body GithubIssue issue);

}

