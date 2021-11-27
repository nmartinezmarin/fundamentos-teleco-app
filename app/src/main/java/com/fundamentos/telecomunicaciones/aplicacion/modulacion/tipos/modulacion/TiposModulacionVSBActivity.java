package com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.fundamentos.telecomunicaciones.aplicacion.R;
public class TiposModulacionVSBActivity extends AppCompatActivity {

    private TextView textoScroll;

    private String htmlScroll = "<ul>\n" +
            "        <li>La modulación de banda lateral vestigial, en inglés Vestigial Side Band (VSB), es una modulación lineal que consiste en filtrar parcialmente una de las dos bandas laterales resultantes de una modulación en doble banda lateral o de una modulación AM.\u000BEsta modulación se utiliza en la transmisión de la componente de luminancia en los sistemas PAL, SECAM y NTSC de televisión analógica. La banda lateral que es parcialmente filtrada constituye un vestigio de la banda lateral original y porta habitualmente del 5% al 10% de la potencia total transmitida, mejorando la relación señal a ruido en las bajas frecuencias de la señal moduladora.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Las principales ventajas de este sistema son:\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Ocupa menor ancho de banda que la modulación en AM de Doble Banda Lateral DSB-LC\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Puede ser desmodulada usando demoduladores síncronos de AM\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>No requiere de filtros tan abruptos (filtros mas realizables en la realidad)\n" +
            "        </li>\n" +
            "    </ul>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_modulacion_vsbactivity);

        textoScroll = (TextView) findViewById(R.id.txv_tipos_modulacion_doble_banda_lateral_vestigial);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            textoScroll.setText(Html.fromHtml(htmlScroll, Html.FROM_HTML_MODE_LEGACY));
        else
            textoScroll.setText(Html.fromHtml(htmlScroll));
    }
}