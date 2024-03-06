package com.salvador.miprimerachamba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente=(Button)findViewById(R.id.btnDescarga);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivity(i);
            }
        });
        TextView textView = findViewById(R.id.textView6);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        ImageView imageView = findViewById(R.id.imageView4);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // URL a la que deseas redirigir
                String url = "https://sifods.minedu.gob.pe/consulta-linea";

                // Crear un Intent para abrir la URL en el navegador
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Iniciar la actividad del navegador
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.imageView3);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // URL a la que deseas redirigir

                String url = "https://constancias.perueduca.pe/#/inicio";


                // Crear un Intent para abrir la URL en el navegador
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Iniciar la actividad del navegador
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.imageView);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // URL a la que deseas redirigir

                String url = "https://passport4seguridad.minedu.gob.pe/iniciarSesion?" +
                        "param=eyJDT0RJR09fU0lTVEVNQSI6IjAwMTMzOSIsIlVSTF9SRVRPUk5PIjoiaHR0cHM6Ly9zZXJ2aWNpb3MtY" +
                        "XluaS5taW5lZHUuZ29iLnBlL2F5bmkvYmllbnZlbmlkYSJ9";
                // Crear un Intent para abrir la URL en el navegador
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Iniciar la actividad del navegador
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView2);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // URL a la que deseas redirigir

                String url = "http://sisdore.regionjunin.gob.pe:8080/sisdore/pages/Inicio.jsf";
                // Crear un Intent para abrir la URL en el navegador
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Iniciar la actividad del navegador
                startActivity(intent);
            }
        });

        ImageView imageView4 = findViewById(R.id.imageView5);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // URL a la que deseas redirigir

                String url = "https://titulosinstitutos.minedu.gob.pe/";
                // Crear un Intent para abrir la URL en el navegador
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Iniciar la actividad del navegador
                startActivity(intent);
            }
        });

    }

}