package com.example.SI_KRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuDosen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menudosen);
        this.setTitle("SI-KRS - Hai... Dosen");

        ImageButton btnDataDiriDsn = (ImageButton)findViewById(R.id.btnDataDiri);
        btnDataDiriDsn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuDosen.this, DataDiriDosen.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKrs = (ImageButton)findViewById(R.id.btnKrs);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuDosen.this, RecViewKrs.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKelas = (ImageButton)findViewById(R.id.btnKelas);
        btnDaftarKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuDosen.this, RecViewKelas.class);
                startActivity(intent);
            }
        });


    }
}