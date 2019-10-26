package com.example.SI_KRS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class menuAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuadmin);
        this.setTitle("SI-KRS - Hai... Admin");

        ImageButton btnDataDiriAdm = (ImageButton)findViewById(R.id.btnDataDiriAdmin);
        btnDataDiriAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuAdmin.this, DataDiriAdmin.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarDosen = (ImageButton)findViewById(R.id.btnDaftarDosen);
        btnDaftarDosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuAdmin.this, RecViewDosen.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarKrs = (ImageButton)findViewById(R.id.btnKelolaKrs);
        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuAdmin.this, RecViewKrs.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarMatkul = (ImageButton)findViewById(R.id.btnDaftarMatkul);
        btnDaftarMatkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuAdmin.this, RecViewMatkul.class);
                startActivity(intent);
            }
        });

        ImageButton btnDaftarMhs = (ImageButton)findViewById(R.id.btnDaftarMhs);
        btnDaftarMhs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(menuAdmin.this, RecViewMahasiswa.class);
                startActivity(intent);
            }
        });
    }
}
