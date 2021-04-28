package com.example.akblatihan3monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*
    Dikerjakan pada tanggal : 29 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada input biodata activity aplikasi Monitory menggunakan ConstraintLayout,
    implementasi custom design pada button selanjutnya, memberikan action intent passing pada button selanjutnya
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class InputBiodataActivity extends AppCompatActivity {

    public static final String MSG="com.example.akblatihan3monitory.MSG";
    private EditText etNama;
    private Button btnSelanjutnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_biodata);

        etNama = findViewById(R.id.etNama);
        btnSelanjutnya = findViewById(R.id.btnSelanjutnya);

        btnSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get value etNama
                String message = etNama.getText().toString();
                // parsing data
                Intent i = new Intent(InputBiodataActivity.this, MainActivity.class);
                i.putExtra(MSG,message);
                startActivity(i);
                finish();

            }
        });

    }
}