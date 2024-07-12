package net.sf.apptoapi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView tvTest;
    TextView tvSponsor;
    TextView tvNumber;
    TextView tvCountry;
    ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        tvTest = findViewById(R.id.tvNama);
        ivPhoto=findViewById(R.id.ivPhoto);
        Intent intent = getIntent();
        tvTest.setText(intent.getStringExtra("name"));

        Glide.with(this)
                .load(intent.getStringExtra("photo"))
                .placeholder(R.drawable.baseline_person_32)
                .into(ivPhoto);
    }
}