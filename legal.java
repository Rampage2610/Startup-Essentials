package com.saikattheadview.startupessentials;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class legal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legal);
        Toolbar toolbar = findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
    public void option1(View view)
    {
        Uri uri = Uri.parse("https://www.startupindiahub.org.in/content/sih/en/startup-scheme/state-startup-policies.html#1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void option2(View view)
    {
        Uri uri = Uri.parse("https://www.startupindiahub.org.in/content/sih/en/reources/knowledge-bank.html#1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void option3(View view)
    {
        Uri uri = Uri.parse("https://www.startupindiahub.org.in/content/sih/en/reources/knowledge-bank.html#1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void option4(View view)
    {
        Uri uri = Uri.parse("https://www.startupindiahub.org.in/content/sih/en/reources/knowledge-bank.html#1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void option5(View view)
    {
        Uri uri = Uri.parse("https://www.startupindiahub.org.in/content/sih/en/reources/government-schemes.html#1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void option6(View view)
    {
        Uri uri = Uri.parse("https://www.startupindiahub.org.in/content/sih/en/reources/knowledge-bank.html#1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void option7(View view)
    {
        Uri uri = Uri.parse("https://www.startupindiahub.org.in/content/sih/en/reources/knowledge-bank.html#1");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
