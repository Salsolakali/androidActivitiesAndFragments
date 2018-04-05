package com.example.fernana6.activitiesandfragments.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fernana6.activitiesandfragments.R;

public class ActivityUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //declaro el boton
        Button btnMostrar = findViewById(R.id.btnMostrarDatos);
        //declaro los edittext
        final EditText nombre = findViewById(R.id.inputNombre);
        final EditText apellidos = findViewById(R.id.inputApellidos);
        final EditText password = findViewById(R.id.inputPassword);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //recojo la info de los edittext y cargo el mensaje
                String mensaje = nombre.getText().toString() + " " + apellidos.getText().toString() + " " +
                        password.getText().toString();
                //muestro la info por toast y por consola
                Toast.makeText(ActivityUser.this, mensaje, Toast.LENGTH_SHORT).show();
                Log.d("User",mensaje);
            }
        });
    }
}
