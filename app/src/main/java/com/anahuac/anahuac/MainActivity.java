package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private Button btn_login_fb;
    private Button btn_login_net;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_login_fb = findViewById(R.id.btn_login_fb);
        btn_login_net = findViewById(R.id.btn_login_netflix);

        btn_login_fb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                Toast.makeText( MainActivity.this, "Boton pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btn_login_net.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view){
                Toast.makeText( MainActivity.this, "Boton pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginNetflixActivity.class);
                startActivity(intent);
            }
        });



    }


}