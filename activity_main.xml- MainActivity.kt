//activity_main.xml 
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:padding="16dp">

        <EditText
            android:id="@+id/etNombre"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Nombre"
            android:drawableStart="@drawable/luna1"
            android:inputType="textPersonName"
            android:textColorHint="#222222" />

        <EditText
            android:id="@+id/etCorreo"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:drawableStart="@drawable/luna1"
            android:hint="Correo Electrónico"
            android:inputType="textEmailAddress"
            android:textColorHint="#222222" />

        <EditText
            android:id="@+id/etTelefono"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Teléfono"
            android:drawableStart="@drawable/luna1"
            android:inputType="phone"
            android:textColorHint="#222222" />

        <ImageView
            android:id="@+id/ivPerfil"
            android:layout_width="130dp"
            android:layout_height="168dp"
            android:layout_gravity="center"
            android:contentDescription="Imagen de Perfil"
            android:src="@drawable/luna1" />

        <Button
            android:id="@+id/btnEnviar"
            android:layout_width="wrap_content"
            android:layout_height="38dp"
            android:layout_gravity="center"
            android:backgroundTint="#0033FF"
            android:text="Enviar" />

    </LinearLayout>
   

</androidx.constraintlayout.widget.ConstraintLayout>

--------------------------------------------------------------------------------------
MainActivity.kt
package com.example.formularioenkotlinconvalidacinygestindinmicadeimgenes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val ivPerfil = findViewById<ImageView>(R.id.ivPerfil)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val correo = etCorreo.text.toString().trim()
            val telefono = etTelefono.text.toString().trim()

            if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
              
                ivPerfil.setImageResource(R.drawable.luna1)
                Toast.makeText(this, "Formulario enviado correctamente", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

