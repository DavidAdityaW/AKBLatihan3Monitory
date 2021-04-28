package com.example.akblatihan3monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
    Dikerjakan pada tanggal : 29 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada welcome activity aplikasi Monitory menggunakan ConstraintLayout dengan konbinasi Relativelayout,
    implementasi custom design pada button mulai, memberikan action intent pada button mulai
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class WelcomeActivity extends AppCompatActivity {

    private Button btnMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnMulai = findViewById(R.id.btnMulai);

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(WelcomeActivity.this, LoginCodeActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}