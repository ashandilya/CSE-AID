package com.uber.repo.mini_project_cse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DBMS extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);
        pdfView = findViewById(R.id.pdfview_dbms);
        pdfView.fromAsset("dbms.pdf").load();
    }
}
