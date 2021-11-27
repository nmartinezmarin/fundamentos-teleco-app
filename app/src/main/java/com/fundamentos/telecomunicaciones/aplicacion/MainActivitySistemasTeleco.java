package com.fundamentos.telecomunicaciones.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fundamentos.telecomunicaciones.aplicacion.clasificacion.ClasificacionFormatoActivity;
import com.fundamentos.telecomunicaciones.aplicacion.clasificacion.ClasificacionMedioTransmisionMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.clasificacion.ClasificacionModoTransmisionActivity;
import com.fundamentos.telecomunicaciones.aplicacion.clasificacion.ClasificacionTamanioMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.clasificacion.ClasificacionTipoFlujoMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.clasificacion.ClasificacionTopologiaMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.preguntas.FormularioTestMainActivity;

/**
 * Politécnico Grancolombiano
 * Fundamentos de Telecomunicaciones
 * Nicolas Martinez Marin - 1410010183
 * Luis Eduardo Ochoa - 1910010689
 * Arandia Ayala Wilmer Fernando - 1920010783
 */
public class MainActivitySistemasTeleco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irAClasificacionModoTransmision(View view){
        Intent intent=new Intent(this, ClasificacionModoTransmisionActivity.class);
        startActivity(intent);

    }

    public void irAClasificacionFormato(View view){
        Intent intent=new Intent(this, ClasificacionFormatoActivity.class);
        startActivity(intent);
    }

    public void irAClasificacionMedioTransmision(View view){
        Intent intent=new Intent(this, ClasificacionMedioTransmisionMainActivity.class);
        startActivity(intent);
    }

    public void irAClasificacionTamanio(View view){
        Intent intent=new Intent(this, ClasificacionTamanioMainActivity.class);
        startActivity(intent);
    }

    public void irAClasificacionTipoFlujo(View view){
        Intent intent=new Intent(this, ClasificacionTipoFlujoMainActivity.class);
        startActivity(intent);
    }

    public void irAClasificacionTopologia(View view){
        Intent intent=new Intent(this, ClasificacionTopologiaMainActivity.class);
        startActivity(intent);
    }

    public void empezarTest (View view){
        Intent intent=new Intent(this, FormularioTestMainActivity.class);
        startActivity(intent);
    }
}