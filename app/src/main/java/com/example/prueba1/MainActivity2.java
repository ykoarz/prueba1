package com.example.prueba1;

import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    ImageButton ibtn;
    TextView total, hombres, mujeres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ibtn = (ImageButton) findViewById(R.id.imageButton);
        total = (TextView)findViewById(R.id.tv_total);
        hombres = (TextView)findViewById(R.id.tv_hombres);
        mujeres = (TextView)findViewById(R.id.tv_mujeres);

        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer encuestados = 0;
                Integer contador = 0;
                if(total.equals(0))
                {
                    encuestados = contador+1;

                }
                if (hombres.equals(0))
                {
                    encuestados = contador+1;
                }
                if(mujeres.equals(0))
                {
                    encuestados = contador+1;
                }

                Intent i = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(i);
            }
        });
    }
}