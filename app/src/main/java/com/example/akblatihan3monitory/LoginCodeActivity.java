package com.example.akblatihan3monitory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
    Dikerjakan pada tanggal : 29 April 2021
    Deskripsi pekerjaan : Membuat layouting tampilan pada login code activity aplikasi Monitory menggunakan ConstraintLayout dengan konbinasi Relativelayout,
    implementasi custom design pada button masuk dan button beli kode keluarga, memberikan action intent pada button masuk, implementasi substring textview kebijakan
    Dibuat oleh :
    NIM   : 10118071
    Nama  : David Aditya Winarto
    Kelas : IF-2
*/

public class LoginCodeActivity extends AppCompatActivity {

    private Button btnMasuk;
    private TextView tvKebijakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);

        btnMasuk = findViewById(R.id.btnMasuk);
        tvKebijakan = findViewById(R.id.tvKebijakan);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginCodeActivity.this, InputBiodataActivity.class);
                startActivity(i);
                finish();
            }
        });

        // substring bold
        String text = "Dengan menekan tombol masuk berarti Anda menyetujui Ketentuan Pengguna dan Kebijakan Data kami";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldText = new StyleSpan(Typeface.BOLD);
        StyleSpan boldText2 = new StyleSpan(Typeface.BOLD);
        // set
        ss.setSpan(boldText, 52, 70, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(boldText2, 75, 89, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //ss.setSpan(boldText, 52, 89, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); // ket-data (bold)
        tvKebijakan.setText(ss);
    }
}