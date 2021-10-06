package com.example.prueba1;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.editTextTextPersonName2);
        pass = (EditText) findViewById(R.id.editTextTextPassword);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.equals("admin")&&(pass.equals("admin123")))
                {
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"usuario o clave incorrecto",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}