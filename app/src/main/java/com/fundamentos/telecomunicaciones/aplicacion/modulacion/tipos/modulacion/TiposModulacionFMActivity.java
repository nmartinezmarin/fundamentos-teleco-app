package com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.fundamentos.telecomunicaciones.aplicacion.R;
public class TiposModulacionFMActivity extends AppCompatActivity {

    private TextView textoScroll;

    private String htmlScroll = " <ul>\n" +
            "    <li>La modulación de frecuencia consiste en variar la frecuencia de la onda portadora de acuerdo con la intensidad de la onda de información . La amplitud de la onda modulada es constante e igual que la de la onda portadora. La frecuencia de la portadora oscila más o menos rápido , según la onda moduladora, o sea , si aplicamos una moduladora de 100 Hz , la onda modulada se desplaza arriba y abajo cien veces en un segundo respecto de la frecuencia de la portadora. Ventajas y características de la FM: La modulación FM es inmune a las no linealidades. Las no linealidades en este caso generan ondas moduladas con portadoras múltiplos de la original. Esta característica hace a FM útil en aquellos sistemas de transmisión de alta potencia ya que el uso de amplificadores permite altos rendimientos. Permite diseñar multiplicadores de frecuencia (generadores de ondas FM con portadora múltiplo de la original) a partir de sencillos elementos no lineales. \n" +
            "        </li>\n" +
            "        <br>\n" +
            "    <li>La ecuación que describe una portadora con modulación de frecuencia es: \n" +
            "        </li>\n" +
            "        <br>\n" +
            "    <li>Z(t) = Vp cos [wi(t)t + ∅]\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Donde : wi(t) = wp + d cos wst wp es la frecuencia de la portadora sin modulación, d es la desviación de frecuencia y es proporcional a la amplitud de la señal moduladora, ws es la frecuencia de la señal moduladora. Con este tipo de modulación, la potencia emitida por la antena transmisora es constante. La forma de onda de portadora con modulación analógica de frecuencia se puede ver como la siguiente imagen :\n" +
            "        </li>\n" +
            "    </ul>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_modulacion_fmactivity);

        textoScroll = (TextView) findViewById(R.id.txv_tipos_modulacion_fm);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            textoScroll.setText(Html.fromHtml(htmlScroll, Html.FROM_HTML_MODE_LEGACY));
        else
            textoScroll.setText(Html.fromHtml(htmlScroll));
    }
}