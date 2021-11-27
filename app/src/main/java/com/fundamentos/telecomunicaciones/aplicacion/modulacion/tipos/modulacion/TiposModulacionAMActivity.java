package com.fundamentos.telecomunicaciones.aplicacion.modulacion.tipos.modulacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.fundamentos.telecomunicaciones.aplicacion.R;

public class TiposModulacionAMActivity extends AppCompatActivity {


    //Texto donde se muestra el resultado del test
    private TextView textoScroll;

    private String htmlScroll = "<ul>\n" +
            "        <li>La modulación de amplitud (AM, por amplitude modulation; en español se usa “amplitud modulada”) es el proceso de cambiar la amplitud de una señal portadora de frecuencia relativamente alta, en proporción con el valor instantáneo de la señal modulante o moduladora (información). La modulación de amplitud es una forma de modulación relativamente poco costosa y de baja calidad, que se usa para emisiones comerciales de señales de audio y de video. También se usa para radiocomunicaciones móviles en dos sentidos, como por ejemplo los radios de banda civil (CB). Los moduladores de AM son dispositivos no lineales, con dos entradas y una salida. Una entrada es una sola señal portadora de alta frecuencia y amplitud constante, y la segunda está formada por señales de información, de frecuencia relativamente baja, que puede tener una sola frecuencia, o ser una forma compleja de onda, formada a su vez por muchas frecuencias.\n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Las frecuencias que son lo suficientemente altas como para irradiarse en forma eficiente de una antena, y propagarse por el espacio libre se suelen llamar radiofrecuencias, o simplemente RF. En el modulador, la información actúa sobre, o modula, la portadora de RF y produce una forma modulada de onda. La señal de información puede tener una sola frecuencia, o con más probabilidad, puede consistir en un intervalo de frecuencias. Por ejemplo, en un sistema normal de comunicaciones de voz se usa un intervalo de frecuencias de información de 300 a 3000 Hz. A la forma de onda modulada de salida de un modulador de AM se le llama con frecuencia envolvente de AM. \n" +
            "        </li>\n" +
            "        <br>\n" +
            "        <li>Espectro de frecuencias y ancho de banda de AM Un modulador de AM es un dispositivo no lineal. En consecuencia, hay mezclado no lineal, y la envolvente de salida es una onda compleja formada por un voltaje de cd, la frecuencia de la portadora y la suma (fc fm) y diferencia (fc fm) de las frecuencias, es decir, los productos cruzados. Las frecuencias de suma y diferencia están desplazadas respecto a la frecuencia de la portadora una cantidad igual a la frecuencia de la señal moduladora. Por consiguiente, un espectro de señal de AM contiene los componentes de frecuencia apartados fm Hz a ambos lados de la portadora. Sin embargo, se debe hacer notar que la onda modulada no contiene un componente de frecuencia que sea igual a la de la señal moduladora.</li>\n" +
            "    </ul>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipos_modulacion_amactivity);

        textoScroll = (TextView) findViewById(R.id.txv_tipos_modulacion_am_scroll);



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textoScroll.setText(Html.fromHtml(htmlScroll, Html.FROM_HTML_MODE_LEGACY));
        } else
            textoScroll.setText(Html.fromHtml(htmlScroll));
    }
}