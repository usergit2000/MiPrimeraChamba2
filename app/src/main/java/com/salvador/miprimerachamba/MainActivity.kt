package com.salvador.miprimerachamba

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var viewSifods: CardView
    private lateinit var viewPeruEduca: CardView
    var siguiente: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        initComponents()
        initListeners()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        siguiente = findViewById<View>(R.id.btnDescarga) as Button
        siguiente!!.setOnClickListener {
            val i = Intent(this@MainActivity, Activity2::class.java)
            startActivity(i)
        }
        val textView = findViewById<TextView>(R.id.textView6)
        textView.movementMethod = LinkMovementMethod.getInstance()
        val imageView = findViewById<ImageView>(R.id.imageView4)
        imageView.setOnClickListener { // URL a la que deseas redirigir
            val url = "https://sifods.minedu.gob.pe/consulta-linea"

            // Crear un Intent para abrir la URL en el navegador
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            // Iniciar la actividad del navegador
            startActivity(intent)
        }
        val imageView1 = findViewById<ImageView>(R.id.imageView3)
        imageView1.setOnClickListener { // URL a la que deseas redirigir
            val url = "https://constancias.perueduca.pe/#/inicio"


            // Crear un Intent para abrir la URL en el navegador
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            // Iniciar la actividad del navegador
            startActivity(intent)
        }
        val imageView2 = findViewById<ImageView>(R.id.imageView)
        imageView2.setOnClickListener { // URL a la que deseas redirigir
            val url = "https://passport4seguridad.minedu.gob.pe/iniciarSesion?" +
                    "param=eyJDT0RJR09fU0lTVEVNQSI6IjAwMTMzOSIsIlVSTF9SRVRPUk5PIjoiaHR0cHM6Ly9zZXJ2aWNpb3MtY" +
                    "XluaS5taW5lZHUuZ29iLnBlL2F5bmkvYmllbnZlbmlkYSJ9"
            // Crear un Intent para abrir la URL en el navegador
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            // Iniciar la actividad del navegador
            startActivity(intent)
        }
        val imageView3 = findViewById<ImageView>(R.id.imageView2)
        imageView3.setOnClickListener { // URL a la que deseas redirigir
            val url = "http://sisdore.regionjunin.gob.pe:8080/sisdore/pages/Inicio.jsf"
            // Crear un Intent para abrir la URL en el navegador
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            // Iniciar la actividad del navegador
            startActivity(intent)
        }
        val imageView4 = findViewById<ImageView>(R.id.imageView5)
        imageView4.setOnClickListener { // URL a la que deseas redirigir
            val url = "https://titulosinstitutos.minedu.gob.pe/"
            // Crear un Intent para abrir la URL en el navegador
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            // Iniciar la actividad del navegador
            startActivity(intent)
        }
    }

    private fun initComponents() {
        viewSifods = findViewById(R.id.viewSifods)
        viewPeruEduca = findViewById(R.id.viewPeruEduca)
    }

    private fun initListeners(){

    }

}