package com.example.aman.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyFirstActivity extends AppCompatActivity {
    EditText usernameet, passwordet;
    Button loginbtn;
    String username = "Aman";
    String password = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);
        usernameet = (EditText) findViewById(R.id.etusername);
        passwordet = (EditText) findViewById(R.id.etpassword);
        loginbtn = (Button) findViewById(R.id.btlogin);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String entusername = usernameet.getText().toString();
                String entpassword = passwordet.getText().toString();
                if (entusername.equals(username) && entpassword.equals(password)) {
                    Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();
                }
                else if (entusername.length()==0&& entpassword.length()==0){
                      usernameet.setError("Enter Username");
                      passwordet.setError("Enter Password");
                }
                else if (entusername.length()!=0&& entpassword.length()==0){
                    passwordet.setError("Enter Password");
                }
                else if (entusername.length()==0&& entpassword.length()!=0){
                    usernameet.setError("Enter Username");
                }
                else{
                    Toast.makeText(getApplicationContext(), "invalid username or password", Toast.LENGTH_SHORT).show();
                }
            }


        });
    }
}
