package com.example.apptemperatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button buttonConverter;
    private EditText editTextTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConverter = findViewById(R.id.buttonConverter);
        editTextTemp = findViewById(R.id.editTextTempe);

        buttonConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                int numero =  Integer.parseInt(editTextTemp.getText().toString());
                int calculo = ((numero * 9/5) + 32);

                intent.putExtra("resultado", calculo);

                startActivity(intent);

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("", "On start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("", "On stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("", "On resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("", "On destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("", "On restart");
    }
}

