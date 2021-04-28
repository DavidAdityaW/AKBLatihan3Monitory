package com.example.akblatihan3monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/*
    Dikerjakan pada tanggal : 29 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada aplikasi Monitory, implementasi custom design pada button, textview, edittext
    memberikan action intent passing dan implementasi substring
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class MainActivity extends AppCompatActivity {

    private TextView tvHi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHi = findViewById(R.id.tvHi);

        // get value data
        Intent i = getIntent();
        String message = i.getStringExtra(InputBiodataActivity.MSG);

        String text = getString(R.string.string_hi).toString();

        // set
        tvHi.setText(String.format(text, message, message, message).toString());

    }
}