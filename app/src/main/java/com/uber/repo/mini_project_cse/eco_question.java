package com.uber.repo.mini_project_cse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class eco_question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_question);
        PDFView pdfView = findViewById(R.id.pdfview_eco_question);
        //pdfView.fromAsset("eco_question.pdf").load();
    }
}
