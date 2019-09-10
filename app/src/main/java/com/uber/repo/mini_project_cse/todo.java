package com.uber.repo.mini_project_cse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class todo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        //ImageView imageView = (ImageView) findViewById(R.id.fab);
    }

    public void list(View view)
    {
        Intent buttonIntent = new Intent(this,todolist.class);
        startActivity(buttonIntent);
    }
}
