package com.example.melek_tarea12;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class Activity_Datos extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        Intent intent = getIntent();
        String Nombre = intent.getStringExtra(MainActivity.NombreEnviado);
        EditText txtNombre2 = (EditText) findViewById(R.id.txtNombre2);
        txtNombre2.setText(Nombre);

        String Apellido = intent.getStringExtra(MainActivity.ApellidoEnviado);
        EditText txtApellido2 = (EditText) findViewById(R.id.txtApellido2);
        txtApellido2.setText(Apellido);

        String Edad = intent.getStringExtra(MainActivity.EdadEnviado);
        EditText txtEdad2 = (EditText) findViewById(R.id.txtEdad2);
        txtEdad2.setText(Edad);

        String Email = intent.getStringExtra(MainActivity.EmailEnviado);
        EditText txtEmail2 = (EditText) findViewById(R.id.txtEmail2);
        txtEmail2.setText(Email);
    }
}
