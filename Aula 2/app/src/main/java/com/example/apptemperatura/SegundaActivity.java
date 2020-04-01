package com.example.apptemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textResultado = findViewById(R.id.textResultado);

        //Recuperar os dados enviados
        Bundle dados = getIntent().getExtras();
        int resultado = dados.getInt("resultado");

        //Configurar valores recuperados
        textResultado.setText(String.valueOf(resultado));

    }
}
