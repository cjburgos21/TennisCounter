package com.example.javier.tenniscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView contador1;
    private TextView contador2;
    private TextView contador3;
    private TextView contador4;
    private Integer suma1;
    private Integer suma2;
    private Integer suma3;
    private Integer suma4;
    private TextView respuesta;
    private TextView respuesta2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //Creando variables
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);
        contador3 = findViewById(R.id.contador3);
        contador4 = findViewById(R.id.contador4);
        respuesta = findViewById(R.id.respuesta);
        respuesta2 = findViewById(R.id.respuesta2);

    }


    public void plus15(View view) {
        suma1 = Integer.parseInt(contador1.getText().toString());
        suma1 +=15;
        contador1.setText(String.valueOf(suma1));
    }


    public void plus10(View view) {
        suma1 = Integer.parseInt(contador1.getText().toString());
        suma1 +=10;
        contador1.setText(String.valueOf(suma1));
    }

    public void advantage(View view) {
        suma1 = Integer.parseInt(contador1.getText().toString());
        suma1 +=1;
        contador1.setText(String.valueOf(suma1));
    }

    public void plusgame(View view) {
        suma3 = Integer.parseInt(contador2.getText().toString());
        suma3 +=1;
        contador2.setText(String.valueOf(suma3));
    }

    public void plus151(View view) {
        suma2 = Integer.parseInt(contador3.getText().toString());
        suma2 +=15;
        contador3.setText(String.valueOf(suma2));
    }

    public void plus101(View view) {
        suma2 = Integer.parseInt(contador3.getText().toString());
        suma2 +=10;
        contador3.setText(String.valueOf(suma2));
    }

    public void advantage2(View view) {
        suma2 = Integer.parseInt(contador3.getText().toString());
        suma2 +=1;
        contador3.setText(String.valueOf(suma2));
    }


    public void plusgame2(View view) {
        suma4 = Integer.parseInt(contador4.getText().toString());
        suma4 += 1;
        contador4.setText(String.valueOf(suma4));

        if (contador4.equals(6)) {
            Toast toast1 = Toast.makeText(getApplicationContext(),"Jugador2 ha ganado", Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.CENTER,4 ,6 );

            toast1.show();
        }

    }

    public void reiniciarmarca(View view){
        contador1.setText("0");
        contador2.setText("0");
        contador3.setText("0");
        contador4.setText("0");
    }

}
