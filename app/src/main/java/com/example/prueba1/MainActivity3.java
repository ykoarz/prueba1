package com.example.prueba1;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    EditText name, age;
    Spinner sp;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name = (EditText) findViewById(R.id.editTextTextPersonName);
        age = (EditText) findViewById(R.id.editTextTextPersonName3);
        sp = (Spinner) findViewById(R.id.spinner);
        btn = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.equals("")&&age.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"¿Estas seguro de continuar?",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"debe rellenar los campos requeridos",Toast.LENGTH_LONG).show();
                }
                if (sp.equals("hombre")||sp.equals("mujer"))
                {
                    Toast.makeText(getApplicationContext(),"debe seleccionar un genero",Toast.LENGTH_LONG).show();
                }
                else
                {
                    String hombre = sp.getSelectedItem().toString();
                    String mujer = sp.getSelectedItem().toString();
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    i.putExtra("hombre",hombre);
                    i.putExtra("mujer",mujer);
                    startActivity(i);
                }
            }
        });
    }
}