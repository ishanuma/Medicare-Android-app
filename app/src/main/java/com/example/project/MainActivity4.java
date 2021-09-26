package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    RatingBar ratingbar;
    Button btsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ratingbar = (RatingBar) findViewById(R.id.rating_bar);
        btsubmit = (Button) findViewById(R.id.bt_submit);

        btsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = String.valueOf(ratingbar.getRating());
                Toast.makeText(getApplicationContext(), s+"Star",
                Toast.LENGTH_SHORT).show();
            }
        });
    }
}