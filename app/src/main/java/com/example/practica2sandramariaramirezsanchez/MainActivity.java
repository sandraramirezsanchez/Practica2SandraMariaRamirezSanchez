package com.example.practica2sandramariaramirezsanchez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNombre;
    EditText etTelefono;
    EditText etEmail;
    EditText etTwitter;
    Button miBoton;
    String nameUser;
    String tel;
    String email;
    String twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miBoton = findViewById(R.id.bt_boton);
        miBoton.setOnClickListener(clic);


        etNombre = findViewById(R.id.et_nombre);
        etTelefono = findViewById(R.id.et_Telefono);
        etEmail = findViewById(R.id.et_email);
        etTwitter = findViewById(R.id.et_Twitter);

        Bundle bundle = getIntent().getExtras();
        etNombre.setText(bundle.getString("nombre"));
        etTelefono.setText(bundle.getString("telefono"));
        etEmail.setText(bundle.getString("email"));
        etTwitter.setText(bundle.getString("twit"));
    }

    View.OnClickListener clic = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            
            etNombre = findViewById(R.id.et_nombre);
            nameUser = String.valueOf(etNombre.getText());

            etTelefono = findViewById(R.id.et_Telefono);
            tel = String.valueOf(etTelefono.getText());

            etEmail = findViewById(R.id.et_email);
            email = String.valueOf(etEmail.getText());

            etTwitter = findViewById(R.id.et_Twitter);
            twit = String.valueOf(etTwitter.getText());


            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("nombre", nameUser);
            intent.putExtra("telefono", tel);
            intent.putExtra("email", email);
            intent.putExtra("twit", twit);
            startActivity(intent);
        }
    };
}