package com.fundamentos.telecomunicaciones.aplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.fundamentos.telecomunicaciones.aplicacion.modulacion.ModulacionAnalogicaMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.ModulacionDobleBandaMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.OndaElectromagnecticaActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.RangosFrecuenciaMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.TiposModulacionMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.TranslacionFrecuenciaMainActivity;
import com.fundamentos.telecomunicaciones.aplicacion.preguntas.FormularioTestMainActivity;

/**
 * Politécnico Grancolombiano
 * Fundamentos de Telecomunicaciones
 * Nicolas Martinez Marin - 1410010183
 * Luis Eduardo Ochoa - 1910010689
 */

public class MainActivityModulacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_modulacion);
    }

    public void empezarTest (View view){
        Intent intent=new Intent(this, FormularioTestMainActivity.class);
        startActivity(intent);
    }

    public void irAOndaElectromagnetica (View view){
        Intent intent=new Intent(this, OndaElectromagnecticaActivity.class);
        startActivity(intent);
    }

    public void irARangosFrecuencia (View view){
        Intent intent=new Intent(this, RangosFrecuenciaMainActivity.class);
        startActivity(intent);
    }

    public void irAModulacionAnalogica (View view){
        Intent intent=new Intent(this, ModulacionAnalogicaMainActivity.class);
        startActivity(intent);
    }

    public void irAtiposModulacion (View view){
        Intent intent=new Intent(this, TiposModulacionMainActivity.class);
        startActivity(intent);
    }

    public void irATranslacionFrecuencia (View view){
        Intent intent=new Intent(this, TranslacionFrecuenciaMainActivity.class);
        startActivity(intent);
    }
}