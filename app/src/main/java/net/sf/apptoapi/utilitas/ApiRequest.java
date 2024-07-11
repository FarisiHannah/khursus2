package net.sf.apptoapi.utilitas;

import net.sf.apptoapi.model.Response;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {

    @GET("view.php")
    Call<Response> getAllRiders();
}
