package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
    TextView txtHello; //membuat variable txtHello dari TextView
    private String nama; //membuat variable nama dengan tipe data String
    private String KEY_NAME = "NAMA"; //membuat variable KEY_NAME bertipe data String yang bernilai NAMA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second); //menampilkan activity_second yang diambil dari layout

        txtHello = (TextView) findViewById(R.id.txtHello); //mendeklarasikan variable txtHello yang bernilai txtHello dari id

        Bundle extras = getIntent().getExtras(); //membuat dan mendeklarasikan variable extras dari Bundle yang memiliki nilai Intent yang telah dibuat
        nama = extras.getString(KEY_NAME); //mendeklarasikan variable nama dengan nilai yang diambil dari extras
        txtHello.setText("Hello, " + nama + " !"); //menetapkan variable txtHello dengan nilai Hello ditambah nilai dari variable nama
    }
}