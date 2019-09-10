package com.uber.repo.mini_project_cse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class cg_question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cg_question);

        PDFView pdfView = findViewById(R.id.pdfview_cg_question);
        pdfView.fromAsset("cg_question.pdf");
    }

}
