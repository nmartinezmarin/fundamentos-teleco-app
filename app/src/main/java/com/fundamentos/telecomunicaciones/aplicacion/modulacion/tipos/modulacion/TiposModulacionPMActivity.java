package com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion;

import androidx.appcompat.app.AppCompatActivity;
import com.fundamentos.telecomunicaciones.aplicacion.R;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TiposModulacionPMActivity extends AppCompatActivity {

    private TextView textoScroll;

    private String htmlScroll = "<ul>\n" +
            "        <li>Es el caso de modulación donde tanto las señales de transmisión como las señales de datos pueden ser analógicas o digitales. Es un tipo de modulación exponencial al igual que la modulación de frecuencia. Se caracteriza porque la fase de la onda portadora varía directamente de acuerdo con la señal modulante, resultando una señal de modulación en fase.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>La modulación de fase no suele ser muy utilizada porque se requiere equipos de recepción más complejos que las señales moduladas en frecuencia. Además, puede presentar problemas de ambigüedad para determinar por ejemplo si una señal tiene una fase de 0º o 180º.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Por lo tanto, si variamos la fase de una portadora con amplitud constante directamente proporcional, a la amplitud de la señal modulante, con una velocidad igual a la frecuencia de la señal modulante, obtenemos la PM (Phase Modulation).\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>La ecuación de una señal modulada en PM es la siguiente:\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Donde:\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>y(t) = Señal modulada\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Ap = Amplitud de la portadora\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>fi(t) = fi(t) = NpX(t)\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Np = Índice de modulación de fase\n" +
            "        </li>\n" +
            "        <br>\n" +
            "    </ul>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_modulacion_pmactivity);

        textoScroll = (TextView) findViewById(R.id.txv_tipos_modulacion_pm);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            textoScroll.setText(Html.fromHtml(htmlScroll, Html.FROM_HTML_MODE_LEGACY));
        else
            textoScroll.setText(Html.fromHtml(htmlScroll));
    }
}