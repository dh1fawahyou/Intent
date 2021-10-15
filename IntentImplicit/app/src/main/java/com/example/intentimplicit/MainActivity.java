package com.example.intentimplicit;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;  //membuat variable button dari Button
    EditText editText;  //membuat variable editText dari EditText
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //menetapkan dan menampilkan activity_main yang diambil dari layout

        button = findViewById(R.id.button); //mendeklarasikan variable button yang bernilai button yang diambil dari id
        editText = findViewById(R.id.editText); //mendeklarasikan variable editText yang bernilai editText yang diambil dari id
        button.setOnClickListener(new View.OnClickListener() {  //membuat fungsi apabila melakukan klik pada button
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString(); //membuat dan mendeklarasikan variable url yang bertipe data String dengan nilai dari variable editText
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url)); //membuat dan mendeklarasikan intent
                startActivity(intent); //menjalankan intent
            }
        });
    }
}