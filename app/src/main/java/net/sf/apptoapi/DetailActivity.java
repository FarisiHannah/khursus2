package net.sf.apptoapi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;

public class DetailActivity extends AppCompatActivity {

    TextView tvTest;
    TextView tvSponsor;
    TextView tvNumber;
    TextView tvCountry;
    ImageView ivPhoto;
    Toolbar toolbar;
    MaterialButton mbEdit;

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
//        tvTest = findViewById(R.id.tvNama);
//        ivPhoto=findViewById(R.id.ivPhoto);
//        tvSponsor=findViewById(R.id.tvSponsor);
//        tvNumber=findViewById(R.id.tvNumber);
//        mbEdit = findViewById(R.id.mbEdit);

        lv = new ListView(this);


        Intent intent = getIntent();
//        tvTest.setText(intent.getStringExtra("name"));
//        tvSponsor.setText(intent.getStringExtra("sponsor"));
//        tvNumber.setText(intent.getStringExtra("number"));

        toolbar = findViewById(R.id.toolbarRiderDetail);
        setSupportActionBar(toolbar);
//        Glide.with(this)
//                .load(intent.getStringExtra("photo"))
//                .placeholder(R.drawable.baseline_person_32)
//                .into(ivPhoto);

//        mbEdit.setOnClickListener(v->{
//
//        });
    }
}