package com.example.melek_tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String NombreEnviado="";
    public static final String ApellidoEnviado="";
    public static final String EdadEnviado="";
    public static final String EmailEnviado="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar =(Button)findViewById(R.id.btnEnviar);
        EditText txtNombres = (EditText) findViewById(R.id.txtNombres);
        EditText txtApellido = (EditText) findViewById(R.id.txtApellido);
        EditText txtEdad = (EditText) findViewById(R.id.txtEdad);
        EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Activity_Datos.class);
                intent.putExtra(NombreEnviado, txtNombres.getText().toString());
                intent.putExtra(ApellidoEnviado, txtApellido.getText().toString());
                intent.putExtra(EdadEnviado, txtEdad.getText().toString());
                intent.putExtra(EmailEnviado, txtEmail.getText().toString());
                Context context = getApplicationContext();
                int duracion = Toast.LENGTH_SHORT;
                Toast mensaje = Toast.makeText(context,"Datos Enviados", duracion);
                mensaje.show();
                startActivity(intent);
            }
        });
    }
}