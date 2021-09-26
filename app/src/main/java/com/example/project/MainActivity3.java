package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button sub_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        sub_button = (Button) findViewById(R.id.button7);

        sub_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               OpenActivity4();

            }
        });
    }

    public void OpenActivity4(){
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
}