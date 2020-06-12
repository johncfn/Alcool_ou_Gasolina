package com.projetoaulacdmfadergs.alcooougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonCalcular;
    private EditText editAlcool;
    private EditText editGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCalcular = (Button)findViewById(R.id.buttonCalcular);
        editAlcool = (EditText)findViewById(R.id.editAlcool);
        editGasolina = (EditText)findViewById(R.id.editGasolina);
        textResultado = (TextView)findViewById(R.id.textResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double valor1;
                Double valor2;
                Double resultado;


                valor1 = Double.parseDouble(editAlcool.getText().toString());
                valor2 = Double.parseDouble(editGasolina.getText().toString());
                resultado = valor1 / valor2;
                if(resultado < 0.7){
                    textResultado.setText("MAIS EM CONTA: ETANOL");
                } else{
                    textResultado.setText("MAIS EM CONTA: GASOLINA");
                }


            }
        });
    }

}
