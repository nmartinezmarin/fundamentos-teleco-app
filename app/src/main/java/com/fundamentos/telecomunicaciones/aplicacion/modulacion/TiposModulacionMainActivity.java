package com.fundamentos.telecomunicaciones.aplicacion.modulacion;

import androidx.appcompat.app.AppCompatActivity;

import com.fundamentos.telecomunicaciones.aplicacion.R;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion.TipoModulacionDSBActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion.TiposModulacionAMActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion.TiposModulacionFMActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion.TiposModulacionPMActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion.TiposModulacionSSBActivity;
import com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion.TiposModulacionVSBActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TiposModulacionMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_modulacion_main);
    }

    public void irAAM (View view){
        Intent intent=new Intent(this, TiposModulacionAMActivity.class);
        startActivity(intent);
    }

    public void irASSB(View view){
        Intent intent=new Intent(this, TiposModulacionSSBActivity.class);
        startActivity(intent);
    }

    public void irAVSB(View view){
        Intent intent=new Intent(this, TiposModulacionVSBActivity.class);
        startActivity(intent);
    }

    public void irADSB(View view){
        Intent intent=new Intent(this, TipoModulacionDSBActivity.class);
        startActivity(intent);
    }

    public void irAFM(View view){
        Intent intent=new Intent(this, TiposModulacionFMActivity.class);
        startActivity(intent);
    }

    public void irAPM(View view){
        Intent intent=new Intent(this, TiposModulacionPMActivity.class);
        startActivity(intent);
    }
}