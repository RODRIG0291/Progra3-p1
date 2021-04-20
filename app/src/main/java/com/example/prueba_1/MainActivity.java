package com.example.prueba_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText caja_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        caja_1 = findViewById(R.id.cajanom);
    }
    public  void  guardarb(View view){
        Toast.makeText(this, "Datos Guardaos", Toast.LENGTH_SHORT).show();
    }
}
