package com.uber.repo.mini_project_cse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class os_question extends AppCompatActivity {

    @Ove0rride
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os_question);
        PDFView pdfView = findViewById(R.id.pdfview_os_question);
        pdfView.fromAsset("os_question.pdf").load();
    }
}
