package com.ds;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import pl.droidsonroids.gif.GifImageView;
public class ProgramsActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    PDFView pdfView;
    GifImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programs);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        pdfView=findViewById(R.id.pdfView);
        imageView=findViewById(R.id.imageView);
        textView=findViewById(R.id.textmid);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(" DS Programs");
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
               this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
       drawer.addDrawerListener(toggle);
       toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
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
        int check=-1;
       switch (id){
           case R.id.pro_1:
             //  check=1;
              // put(check);
               break;
           case R.id.pro_2:
               check=2;
               put(check);
               break;
           case R.id.pro_3:
               check=3;
               put(check);
               break;
           case R.id.pro_4:
               check=4;
               put(check);
               break;
           case R.id.pro_5:
               check=5;
               put(check);
               break;
           case R.id.pro_6:
               check=6;
               put(check);
               break;
           case R.id.pro_7:
               check=7;
               put(check);
               break;
           case R.id.pro_8:
               check=8;
               put(check);
               break;
           case R.id.pro_9:
               check=9;
               put(check);
               break;
           case R.id.pro_10:
               check=10;
               put(check);
               break;
           case R.id.pro_11:
               check=11;
               put(check);
               break;
           case R.id.pro_12:
               check=12;
               put(check);
               break;
           case R.id.pro_13:
               check=13;
               put(check);
               break;
           case R.id.pro_14:
               check=14;
               put(check);
               break;
           case R.id.pro_15:
            //   check=15;
             //  put(check);
               break;
           case R.id.pro_16:
               check=16;
               put(check);
               break;
       }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void put(int i) {
        getSupportActionBar().setTitle("Program "+i);
        imageView.setVisibility(View.GONE);
        textView.setVisibility(View.GONE);
        pdfView.fromAsset(i+"Program.pdf").load();
    }
}
