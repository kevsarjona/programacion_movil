package com.anahuac.anahuac;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    private Button btnAlert;
    private Button btnAlertWithButtons;
    private Button btnAlertWithOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnAlert = findViewById(R.id.btn_alerta);
        btnAlertWithButtons = findViewById(R.id.btn_alerta_with_button);
        btnAlertWithOptions = findViewById(R.id.btn_alerta_with_options);

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Que deseas hacer");
                builder.setMessage("Pidemeloo");
                builder.create().show();
            }
        });

        btnAlertWithButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Dije que quieres hacer joder");
                builder.setMessage(">:(");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, "Positive", Toast.LENGTH_LONG).show();

                    }
                });
                builder.setNegativeButton("No quiero", null);
                builder.setNeutralButton("Mas tarde", null);
                builder.create().show();
            }
        });

        btnAlertWithOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setTitle("Selecciona un color");
                String[] array =  new String[3];
                array[0] = "Verde";
                array[1] = "Blanco";
                array[2] = "Rojo";
                builder.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertActivity.this, array[i], Toast.LENGTH_LONG).show();
                    }
                });
                builder.create().show();
            }
        });
    }
}