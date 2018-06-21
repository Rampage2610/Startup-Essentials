package com.saikattheadview.startupessentials;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Home_Screen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home__screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(getApplicationContext(), Get_in_touch.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_bestpract) {
            Intent intent = new Intent(getApplicationContext(), BestPractices.class);
            startActivity(intent);
        } else if (id == R.id.nav_legal) {
            Intent intent = new Intent(getApplicationContext(), legal.class);
            startActivity(intent);
        } else if (id == R.id.nav_skills) {
            Intent intent = new Intent(getApplicationContext(), Skills.class);
            startActivity(intent);
        }  else if (id == R.id.nav_reach) {
            Intent intent = new Intent(getApplicationContext(), ContactUs.class);
            startActivity(intent);
        } else if (id == R.id.nav_send) {
            Intent intent = new Intent(getApplicationContext(), feedback.class);
            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void contact(View view)
    {
        Intent intent = new Intent(Home_Screen.this, Get_in_touch.class);
        startActivity(intent);
    }
    public void reachus(View view)
    {
        Intent intent = new Intent(Home_Screen.this, ContactUs.class);
        startActivity(intent);
    }
    public void legal(View view)
    {
        Intent intent = new Intent(Home_Screen.this, legal.class);
        startActivity(intent);
    }

    public void explore(View view)
    {
        Intent intent = new Intent(Home_Screen.this, Skills.class);
        startActivity(intent);
    }
    public void bestprac(View view)
    {
        Intent intent = new Intent(Home_Screen.this, BestPractices.class);
        startActivity(intent);
    }
    public void machine(View view)
    {
        Intent intent = new Intent(Home_Screen.this, machine_learning.class);
        startActivity(intent);
    }
    public void webexp(View view)
    {
        Intent intent = new Intent(Home_Screen.this, web_experience.class);
        startActivity(intent);
    }
    public void security(View view)
    {
        Intent intent = new Intent(Home_Screen.this, security.class);
        startActivity(intent);
    }
    public void build(View view)
    {
        Intent intent = new Intent(Home_Screen.this, build_product.class);
        startActivity(intent);
    }
    public void insight(View view)
    {
        Intent intent = new Intent(Home_Screen.this, insights.class);
        startActivity(intent);
    }
    public void hosting(View view)
    {
        Intent intent = new Intent(Home_Screen.this, hosting.class);
        startActivity(intent);
    }
    public void productivity(View view)
    {
        Intent intent = new Intent(Home_Screen.this, productivity.class);
        startActivity(intent);
    }
    public void market(View view)
    {
        Intent intent = new Intent(Home_Screen.this, market.class);
        startActivity(intent);
    }
    public void monetize(View view)
    {
        Intent intent = new Intent(Home_Screen.this, monetize.class);
        startActivity(intent);
    }
}
