package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button signbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        signbtn=findViewById(R.id.signbtn);
    }

    public void go(View view) {
        String username1=username.getText().toString();
        if(username1.length()<=0){
            Toast.makeText(this, "Please Enter Your username or Password first", Toast.LENGTH_SHORT).show();}
        else {
            Intent in=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(in);
        }
        public boolean onCreateOptionMenu(Menu menu){
            MenuInflater inflater=getMenuInflater();
            inflater.inflate(R.menu.mymenu,menu);
            return true;

        }
    }
}