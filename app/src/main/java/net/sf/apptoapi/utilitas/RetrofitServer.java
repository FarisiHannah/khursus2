package net.sf.apptoapi.utilitas;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitServer {
    private static final String baseUrl="http://192.168.99.190/android-api/operations/";
    //private static final String baseUrl="https://flutterix.000webhostapp.com/android-api/operations/";
    private static Retrofit retrofit;

    public static Retrofit connectRetrofit() {
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
