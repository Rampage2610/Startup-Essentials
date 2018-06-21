package com.saikattheadview.startupessentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Get_in_touch  extends AppCompatActivity  {


    private EditText editTextName;
    private EditText editTextPhone;
    private EditText editTextEmail;
    private EditText editTextSubject;
    private EditText editTextMessage;
    private DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_in_touch);

        Toolbar toolbar = findViewById(R.id.my_awesome_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        databaseReference = FirebaseDatabase.getInstance().getReference();
        editTextName = findViewById(R.id.name);
        editTextPhone = findViewById(R.id.phone);
        editTextEmail = findViewById(R.id.email);
        editTextSubject = findViewById(R.id.subject);
        editTextMessage = findViewById(R.id.message);

    }
    private void saveUserInformation() {
        String name = editTextName.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String subject = editTextSubject.getText().toString().trim();
        String message = editTextMessage.getText().toString().trim();

        UserInformation userInformation = new UserInformation(name, phone, email, subject, message);

        databaseReference.push().setValue(userInformation);
        Toast.makeText(this, "Information Saved...", Toast.LENGTH_LONG).show();
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }


    public void onClick(View view) {
            saveUserInformation();
            finish();
            Intent intent = new Intent(getApplicationContext(), Thankyou_page.class);
            startActivity(intent);
         }
}
