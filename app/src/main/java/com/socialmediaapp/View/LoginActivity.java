package com.socialmediaapp.View;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.socialmediaapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        onLogin();
    }
    private void onLogin(){
        EditText edT_email = findViewById(R.id.email);
        EditText edT_password = findViewById(R.id.password);
        Button btn_login = findViewById(R.id.btn_login);
        TextView tv_signup = findViewById(R.id.tv_signup);
        btn_login.setOnClickListener(view -> {
            if(edT_email.getText().toString().equals("admin") && edT_password.getText().toString().equals("admin")){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            }
            else
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show();
        });
        tv_signup.setOnClickListener(view -> {
            Intent registerActivity = new Intent(this, RegisterActivity.class);
            startActivity(registerActivity);
        });
    }
}