package com.saikattheadview.startupessentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class Thankyou_page extends AppCompatActivity{
    private LinearLayout l1;
    private LinearLayout l2;
    private Button btnsub;
    private Animation uptodown;
    private Animation downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou_page);

        btnsub = findViewById(R.id.btnsubscribe);
        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        l1.setAnimation(uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        l2.setAnimation(downtoup);
    }
    public void back (View view)
    {
        Intent intent = new Intent(Thankyou_page.this, Home_Screen.class);
        startActivity(intent);
    }
}
