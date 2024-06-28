package com.example.blogapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddPage extends AppCompatActivity {

    EditText e1,e2;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_page);

        e1=(EditText) findViewById(R.id.tit);
        e2=(EditText) findViewById(R.id.descr);
        b1=(AppCompatButton) findViewById(R.id.gobackbtn);
        b2=(AppCompatButton) findViewById(R.id.addbtn);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), LoggedPage.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getTitle=e1.getText().toString();
                String getDescription=e2.getText().toString();
                Toast.makeText(getApplicationContext(),getTitle+" "+getDescription,Toast.LENGTH_SHORT).show();
            }
        });

    }
}