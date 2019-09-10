package com.uber.repo.mini_project_cse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class cg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg);
       PDFView pdfView = findViewById(R.id.pdfview_cg);
        pdfView.fromAsset("cg.pdf").load();
    }
}
