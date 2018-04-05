package com.example.fernana6.activitiesandfragments.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fernana6.activitiesandfragments.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //declaro los objetos boton
        Button btnActivity = findViewById(R.id.btnActivity);
        Button btnFragment = findViewById(R.id.btnFragment);
        //Activo el listener de los botones
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, ActivityUser.class));
                Intent activity = new Intent(MainActivity.this, ActivityUser.class);
                startActivity(activity);
            }
        });

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FragmentActivity.class));
            }
        });




    }



}
