package com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.fundamentos.telecomunicaciones.aplicacion.R;
public class TipoModulacionDSBActivity extends AppCompatActivity {

    private TextView textoScroll;

    private String htmlScroll ="<ul>\n" +
            "        <li>Es una transmisión en la que las frecuencias producidas por la modulación de amplitud (AM) están espaciadas simétricamente por encima y por debajo de la frecuencia de la portadora y el nivel de la portadora se reduce al nivel práctico más bajo, idealmente suprimido por completo. \n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>En la modulación DSB-SC, a diferencia de AM, la portadora de onda no se transmite; así, gran parte de la potencia se distribuye entre las bandas laterales, lo que implica un aumento de la cobertura en DSB-SC, en comparación con AM, para el mismo uso de potencia.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>La transmisión DSB-SC es un caso especial de transmisión de portadora reducida de doble banda lateral. Se utiliza para sistemas de datos por radio. Este modo se utiliza con frecuencia en comunicaciones de voz de radioaficionados, especialmente en bandas de alta frecuencia.\n" +
            "        </li>\n" +
            "    </ul>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_modulacion_dsbactivity);

        textoScroll = (TextView) findViewById(R.id.txv_tipos_modulacion_doble_banda_lateral_suprimida);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            textoScroll.setText(Html.fromHtml(htmlScroll, Html.FROM_HTML_MODE_LEGACY));
        else
            textoScroll.setText(Html.fromHtml(htmlScroll));

    }
}