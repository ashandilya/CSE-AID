package com.uber.repo.mini_project_cse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class dbms_question extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms_question);
        PDFView pdfView = findViewById(R.id.pdfview_dbms_question);
        //pdfView.fromAsset("dbms_question.pdf").load();
    }
}
