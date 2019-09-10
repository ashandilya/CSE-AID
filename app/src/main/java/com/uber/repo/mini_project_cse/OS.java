package com.uber.repo.mini_project_cse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class OS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);
        PDFView pdfView = findViewById(R.id.pdfview_os);
        pdfView.fromAsset("os.pdf").load();
    }
}
