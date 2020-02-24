package example.emre.com.mobilliumexample.Services;

import java.util.List;

import example.emre.com.mobilliumexample.Models.Obj;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetMethods {
    @GET("discover")
    Call<List<Obj>> getNews();
}
