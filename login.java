package com.example.simple_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
    public TextView et;
    public EditText nm;
    public Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et=findViewById(R.id.textView5);
        bt=findViewById(R.id.button);
        nm=findViewById(R.id.Name);
        Toast.makeText(getApplicationContext(),"Application is opening!",Toast.LENGTH_LONG).show();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=nm.getText().toString();
                Toast.makeText(login.this,"Welcome "+s1,Toast.LENGTH_LONG).show();
                Intent intent=new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this,register.class));
            }
        });
    }
}