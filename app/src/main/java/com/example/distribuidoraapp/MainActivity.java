package com.example.distribuidoraapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    EditText txtCorreo, txtClave;
    Button btnIngresar;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCorreo = findViewById(R.id.txtCorreo);
        txtClave = findViewById(R.id.txtClave);
        btnIngresar = findViewById(R.id.btnIngresar);

        mAuth = FirebaseAuth.getInstance();

        btnIngresar.setOnClickListener(v -> {
            String correo = txtCorreo.getText().toString().trim();
            String clave = txtClave.getText().toString().trim();

            if (correo.isEmpty() || clave.isEmpty()) {
                Toast.makeText(this, "Ingrese correo y contraseña", Toast.LENGTH_SHORT).show();
                return;
            }

            mAuth.signInWithEmailAndPassword(correo, clave)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(this, "Login correcto", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                            startActivity(intent);
                        }else {
                            Toast.makeText(this, "Error en login", Toast.LENGTH_SHORT).show();
                        }
                    });
        });
    }
}