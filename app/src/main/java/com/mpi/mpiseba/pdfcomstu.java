package com.mpi.mpiseba;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfcomstu extends AppCompatActivity {

    ImageView back;
    PDFView comstu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfcomstu);
        getWindow().setStatusBarColor(ContextCompat.getColor(pdfcomstu.this,R.color.app_themecolor));

        back=findViewById(R.id.back_about);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pdfcomstu.super.onBackPressed();

            }
        });

        comstu = findViewById(R.id.comstupdf);
        comstu.fromAsset("allcomstudent.pdf").load();

    }
}