package com.ingegachuz.mascotas.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ingegachuz.mascotas.R;

public class ActivityContacto extends AppCompatActivity {

    private EditText etNombre;
    private EditText etEmail;
    private EditText etMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_contacto);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etEmail  = (EditText) findViewById(R.id.etEmail);
        etMensaje= (EditText) findViewById(R.id.etMensaje);

      }

    public void enviarMail(View v){
        String correo = etEmail.getText().toString();
        String nombre = etNombre.getText().toString();
        String mensaje = etMensaje.getText().toString();
        String email[] = {correo};
        Intent emailIntent = new Intent((Intent.ACTION_SEND));
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, nombre);
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
        startActivity(Intent.createChooser(emailIntent, "Send Email"));

    }
}
