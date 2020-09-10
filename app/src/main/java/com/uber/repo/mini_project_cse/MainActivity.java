package com.uber.repo.mini_project_cse;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

   // private static int SPLASH_TIME_OUT = 5000;

    CardView routine,calender;
    CardView nav_camera,nav_manage,nav_gallery,nav_send,nav_share;
    //ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //FullScreen Enable or Hide Status bar
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashintent = new Intent(MainActivity.this,splash_screen.class);
                startActivity(splashintent);
                finish();
            }
        },SPLASH_TIME_OUT);*/

        //Toolbar toolbar = findViewById(R.id.toolbar);
        routine=(CardView) findViewById(R.id.routine);
        calender= (CardView) findViewById(R.id.calender);
        nav_camera = (CardView) findViewById(R.id.nav_camera);
        nav_manage = (CardView) findViewById(R.id.nav_manage);
        nav_gallery = (CardView) findViewById(R.id.nav_gallery);
        nav_send = (CardView) findViewById(R.id.nav_send);
        nav_share = (CardView) findViewById(R.id.nav_share);

        //viewFlipper = findViewById(R.id.tribute);

        nav_share.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Sharing Message";
                String shareSub = "Sharing short Message";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareSub);
                startActivity(Intent.createChooser(myIntent,"Share via"));
            }
        });

        //setSupportActionBar(toolbar);
        //toolbar.setBackgroundColor(Color.TRANSPARENT);

        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();*/

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*int images[] = {R.drawable.jis,R.drawable.silasingh,R.drawable.principle,R.drawable.sovik,R.drawable.jisce,R.drawable.dharampal};

        for(int image:images)
        {
            flipperImages(image);
        }*/

        /*for(int image:views)
        {
            flipperviews(image);
        }*/
    }


    //Slider
   /* public void flipperImages(int image)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setInAnimation(this,android.R.anim.slide_out_right);
    }*/
    //main_Page Content Intent

    public void calender(View view)
    {
        Intent buttonIntent = new Intent(this,calender_Activity.class);
        startActivity(buttonIntent);
    }

    public void routine(View view)
    {
        Intent buttonIntent = new Intent(this,routine_Activity.class);
        startActivity(buttonIntent);
    }

    public void ecell(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jiscollege.ac.in/incubator/"));
        startActivity(browserIntent);
    }

    public void CSI(View view)
    {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.jiscollege.ac.in/"));
        startActivity(browserIntent);
    }
    public void OCW(View view)
    {
        Intent buttonIntent = new Intent(this,OCW.class);
        startActivity(buttonIntent);
    }
    public void home(View view)
    {
        Intent buttonIntent = new Intent(this,MainActivity.class);
        startActivity(buttonIntent);
    }
    public void todo(View view)
    {
        Intent buttonIntent = new Intent(this,todo.class);
        startActivity(buttonIntent);
    }
    public void about(View view)
    {
        Intent buttonIntent = new Intent(this,aboutUs.class);
        startActivity(buttonIntent);
    }
    public void suggestion(View view)
    {
        Intent buttonIntent = new Intent(this,suggestion.class);
        startActivity(buttonIntent);
    }
    public void logout(View view)
    {
        Intent buttonIntent = new Intent(this,SignIn.class);
        startActivity(buttonIntent);
        Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_SHORT).show();
    }
    public void question(View view)
    {
        Intent buttonIntent = new Intent(MainActivity.this,question_Sets.class);
        startActivity(buttonIntent);
        //Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_SHORT).show();
    }
    public void mentor(View view)
    {
        Intent buttonIntent = new Intent(MainActivity.this,mentor.class);
        startActivity(buttonIntent);
        //Toast.makeText(getApplicationContext(), "Logout Successful", Toast.LENGTH_SHORT).show();
    }



    //Nav_Drawer Content Intent

   /* public void home(View view)
    {
        Intent buttonIntent = new Intent(this,MainActivity.class);
        startActivity(buttonIntent);
    }
    public void todo(View view)
    {
        Intent buttonIntent = new Intent(this,routine_Activity.class);
        startActivity(buttonIntent);
    }
   public void About(View view)
    {
        Intent buttonIntent = new Intent(this,aboutUs.class);
        startActivity(buttonIntent);
    }
*/

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        }  else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
