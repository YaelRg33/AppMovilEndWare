package com.example.endware;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ajuste automático por barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // BOTÓN para iniciar sesión con celular
        MaterialButton btnLoginCelular = findViewById(R.id.btnLoginCelular);
        btnLoginCelular.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegistroTelefonoActivity.class);
            startActivity(intent);
        });

        // BOTÓN para iniciar sesión con correo
        MaterialButton btnLoginCorreo = findViewById(R.id.btnLoginCorreo);
        btnLoginCorreo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RegistroCorreoActivity.class);
            startActivity(intent);
        });
    }
}
