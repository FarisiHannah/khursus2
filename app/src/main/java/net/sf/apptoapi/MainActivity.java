package net.sf.apptoapi;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.progressindicator.CircularProgressIndicator;

import net.sf.apptoapi.adapters.AdapterRider;
import net.sf.apptoapi.model.Response;
import net.sf.apptoapi.model.Rider;
import net.sf.apptoapi.utilitas.ApiRequest;
import net.sf.apptoapi.utilitas.RetrofitServer;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    CircularProgressIndicator loadingIndicator;
    List<Rider> riders;
    private RecyclerView rv;
    private RecyclerView.Adapter adapterRider;
    private RecyclerView.LayoutManager layoutManager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        loadingIndicator = findViewById(R.id.progressIndicatorRider);
        loadingIndicator=findViewById(R.id.progressIndicatorRider);
        toolbar = findViewById(R.id.toolbarMainActivity);
        rv = findViewById(R.id.recyclerViewRiders);
        layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rv.setLayoutManager(layoutManager);

    }

    @Override
    protected void onResume() {
        super.onResume();
        getAllRiders();
    }

    public void getAllRiders(){
        Log.i("info","Pemanggilan fungsi getAllRider");
        loadingIndicator.setVisibility(View.VISIBLE);
        ApiRequest apiRequest = RetrofitServer.connectRetrofit().create(ApiRequest.class);
        Call<Response>  responseCall = apiRequest.getAllRiders();
        responseCall.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                riders=Objects.requireNonNull(response.body()).getData();
                adapterRider = new AdapterRider(MainActivity.this,riders);
                rv.setAdapter(adapterRider);
            }

            @Override
            public void onFailure(Call<Response> call, Throwable throwable) {
                loadingIndicator.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this,"",Toast.LENGTH_LONG);
            }
        });
        loadingIndicator.setVisibility(View.GONE);
    }
}