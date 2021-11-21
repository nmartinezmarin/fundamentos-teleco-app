package com.fundamentos.telecomunicaciones.aplicacion.preguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.fundamentos.telecomunicaciones.aplicacion.R;

public class FormularioTestMainActivity extends AppCompatActivity {

    private final int cantidadPreguntas = 5;

    //Texto donde se muestra el resultado del test
    private TextView respuestaTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_test_main);

        respuestaTest = (TextView) findViewById(R.id.resultadoTest);
    }



    public void validarRespuestasTest(View view){

        //Se recorren todos los radioBUttons y se verifica que se hayan selecciona una respuesta
        //Si todos hay una respuesta seleccionada para todas las preguntas se validan las respuestas

        int respuestasSeleccionadas = 0;
        int respuestasCorrectas = 0;

        for (int i = 1; i <= cantidadPreguntas; i++){

            int resID = getResources().getIdentifier("radioGroupPregunta" + i, "id", getPackageName());

            RadioGroup radioGroup = findViewById(resID);

            int radioButtonID = radioGroup.getCheckedRadioButtonId();

            //cuando no se ha seleccionado ninguna opción se retorna -1
            if(radioButtonID > 0 ){

                respuestasSeleccionadas ++;
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(radioButtonID);

                if(radioButton.getTag() != null && radioButton.getTag().toString().equals(getResources().getString(R.string.txt_tag_respuesta_correcta)))
                    respuestasCorrectas++;
            }

        }

        if(respuestasSeleccionadas == cantidadPreguntas){
            respuestaTest.setVisibility(View.VISIBLE);
            String respuesta = String.format("Ha obtenido %d %s de %d",
                    respuestasCorrectas,
                    respuestasCorrectas == 1 ? "respuesta correcta" : "respuestas correctas",
                    cantidadPreguntas);

            respuestaTest.setText(respuesta);
        }
    }
}