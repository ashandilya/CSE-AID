package com.uber.repo.mini_project_cse;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class OCW extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocw);
        TextView textView = (TextView) findViewById(R.id.for_font);
        //Typeface myCustomFont= Typeface.createFromAsset(getAssets(),"Font/Vollkorn-Regular.ttf");
        //textView.setTypeface(myCustomFont);

    }
    public void dbms(View view)
    {
        Intent buttonIntent = new Intent(this,DBMS.class);
        startActivity(buttonIntent);
    }public void java(View view)
    {
        Intent buttonIntent = new Intent(this,java.class);
        startActivity(buttonIntent);
    }
    public void cg(View view)
    {
        Intent buttonIntent = new Intent(this,cg.class);
        startActivity(buttonIntent);
    }
    public void or(View view)
    {
        Intent buttonIntent = new Intent(this,OR.class);
        startActivity(buttonIntent);
    }
    public void os(View view)
    {
        Intent buttonIntent = new Intent(this,OS.class);
        startActivity(buttonIntent);
    }
    public void economic(View view)
    {
        Intent buttonIntent = new Intent(this,Economic.class);
        startActivity(buttonIntent);
    }
    public void syllabus(View view)
    {
        Intent buttonIntent = new Intent(this,syllabus.class);
        startActivity(buttonIntent);
    }
}
