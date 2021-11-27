package com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.fundamentos.telecomunicaciones.aplicacion.R;
public class TiposModulacionSSBActivity extends AppCompatActivity {

    private TextView textoScroll;

    private String htmlScroll = "<ul>\n" +
            "        <li>La modulación en banda lateral única (BLU) o (SSB) (del inglés Single Side Band) es una evolución de la AM. La banda lateral única es muy importante para el ramo de la electrónica básica ya que permite transmitir señales de radio frecuencia que otras modulaciones no pueden transmitir.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>En la transmisión en amplitud modulada se gasta la mitad de la energía en transmitir una onda de frecuencia constante llamada portadora, y sólo un cuarto en transmitir la información de la señal moduladora (normalmente voz) en una banda de frecuencias por encima de la portadora. El otro cuarto se consume en transmitir exactamente la misma información, pero en una banda de frecuencias por debajo de la portadora.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Es evidente que ambas bandas laterales son redundantes, bastaría con enviar una sola. Y la portadora tampoco es necesaria.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Por medio de filtros colocados en el circuito de transmisión, el transmisor BLU elimina la portadora y una de las dos bandas.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>El receptor, para poder reproducir la señal que recibe, genera localmente -mediante un oscilador- la portadora no transmitida, y con la banda lateral que recibe, reconstruye la información de la señal moduladora original.\n" +
            "        </li>\n" +
            "    </ul>";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_modulacion_ssbactivity);

        textoScroll = (TextView) findViewById(R.id.txv_tipos_modulacion_doble_banda_lateral_unica);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textoScroll.setText(Html.fromHtml(htmlScroll, Html.FROM_HTML_MODE_LEGACY));
        } else
            textoScroll.setText(Html.fromHtml(htmlScroll));
    }
}