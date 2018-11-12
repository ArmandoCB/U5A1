package unam.fca.dmoviles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    /*primero declaramos variables*/
    EditText V1;
    EditText V2;
    Button btn1;
    TextView res;
    private final static String TEXT_VIEW_KEY = "TEXT_VIEW_KEY";
    private final static int IMAGE_WIDTH = 400;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 8 Creacion de una calculadora de porcentajes
        //En esta actividad crearas una aplicacion que calcule la diferencia relativa en porcentaje entre dos numeros.

        /*cargamos nuestas variables con los objetos que se encuentran en el lay out*/
        setContentView(R.layout.activity_main);
        V1=(EditText)findViewById(R.id.editText);
        V2=(EditText)findViewById(R.id.editText2);
        res=(TextView)findViewById(R.id.textViewResult);
        btn1=(Button)findViewById(R.id.button);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float va1= Integer.parseInt(V1.getText().toString());
                float va2= Integer.parseInt(V2.getText().toString());
                float s= ((va2-va1)/va1)*100;
                res.setText(s+"%");
            }
        });



        /*LINEAS PARA EL GUARDADO DE LA VARIABLE TEXTVIEW*/
/*
        @Override
        public void onRestoreInstanceState(Bundle savedInstanceState) {
            final TextView res = findViewById(R.id.textViewResult);
            res.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
        }
        @Override
        public void onSaveInstanceState(Bundle outState) {
            final TextView res = findViewById(R.id.textViewResult);
            outState.putString(TEXT_VIEW_KEY, res.getText().toString());
            super.onSaveInstanceState(outState);
        }
*/
        //Actividades
        //a) Ejecuta la aplicacion y familiarizate con el layout definido en R.layout.activity_main
        //b) Crea la logica para calcular la diferencia relativa en porcentaje entre dos numeros
        //c) La formula para calcular la diferencia relativa en porcentaje esta en: https://www.calculatorsoup.com/calculators/algebra/percent-change-calculator.php
        //d) La aplicacion debe calcular la diferencia relativa en porcentaje de los valores contenidos en "editText" y "editText2"
        //e) Al hacer click en el boton "button", la aplicacion debera calcular dicha diferencia y poner el resultado en el campo "textViewResult"
        //f) La aplicacion debera manejar adecuadamente el cambio de rotacion para el resultado y los campos de texto
        //e) Anota tus respuestas y las capturas de pantalla en un documento en Word
        //f) Sube tu codigo al repositorio.
        //g) Sube el documento Word a la plataforma Moodle. Incluye la liga a tu repositorio
    }
}

