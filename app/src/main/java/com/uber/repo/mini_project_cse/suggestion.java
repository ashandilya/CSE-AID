package com.uber.repo.mini_project_cse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class suggestion extends AppCompatActivity {

    EditText meditText1,meditText2,meditText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        meditText1= findViewById(R.id.et1);
        meditText2= findViewById(R.id.et2);
        meditText3= findViewById(R.id.et3);

       Button text_button = findViewById(R.id.button);

       text_button.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v) {
               sendMail();
           }
       });
    }
    private void sendMail(){
        String recipientList = meditText1.getText().toString();
        String[] recipients = recipientList.split(",");

        String subject = meditText2.getText().toString();
        String message = meditText3.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);

        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Select your favourite Email Clint"));
        Toast.makeText(getApplicationContext(), "Thanks for your suggestion!", Toast.LENGTH_LONG).show();
        finish();

    }

}
