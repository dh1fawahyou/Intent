package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name; //membuat variable name dari EditText
    Button btnSend; //membuat variable btnSend dari Button

    private String KEY_NAME = "NAMA"; //membuat variable KEY_NAME bertipe data String yang bernilai NAMA
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //menetapkan dan menampilkan activity_main yang diambil dari layout

        name = (EditText) findViewById(R.id.editNama); //mendeklarasikan variable name yang bernilai editNama yang diambil dari id
        btnSend = (Button) findViewById(R.id.btnSend); //mendeklarasikan variable btnSend yang bernilai btnSend yang diambil dari id

        btnSend.setOnClickListener(new View.OnClickListener() { //membuat fungsi apabila melakukan klik pada btnSend
            @Override
            public void onClick(View v) {
                try{
                    String nama = name.getText().toString(); //membuat dan mendeklarasikan variable nama bertipe data String dengan nilai yang diambil dari variable name
                    if (nama != ""){ //melakukan percabangan dengan kasus apabila nama tidak bernilai "" atau kosong
                        Intent i = new Intent(MainActivity.this, ActivitySecond.class); //membuat dan mendeklarasikan i sebagai Intent baru apabila bernilai True
                    i.putExtra(KEY_NAME, nama); //memasukkan nilai dari i kedalam variable KEY_NAME
                    startActivity(i); //mengeksekusi intent
                    } else {
                        Toast.makeText(getApplication(), "YOU NEED TO FILL YOUR NAME", Toast.LENGTH_SHORT); //menampilkan pesan apabila bernilai false
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "ERROR, TRY AGAIN!", Toast.LENGTH_SHORT); //menampilkan pesan apabila proses percabangan tidak dapat di proses
                }
            }
        });

    }
}