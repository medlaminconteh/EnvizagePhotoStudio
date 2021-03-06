package com.example.envizagephotostudio;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class adminLogin extends AppCompatActivity {
    EditText username,password;
    Button phuLogin;
    private  int count=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        username=(EditText)findViewById(R.id.adminUsername);
        password=(EditText)findViewById(R.id.adminPass);
        phuLogin=(Button)findViewById(R.id.adminLogin);

        phuLogin.setOnClickListener(
                new Button.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        validate(username.getText().toString(),password.getText().toString());

                        username.getText().clear();
                        password.getText().clear();
                    }
                });

    }
    private void validate(String userName, String userPassword){
        if((userName.equals("medlamin")) && (userPassword.equals("12345"))){
            Intent inte =new Intent(this,adminDashboardActivity.class);
            startActivity(inte);
        }else{
            count--;
            Toast.makeText(getApplicationContext(),"The username and password doesn't match",Toast.LENGTH_SHORT).show();

            if (count==0){
                phuLogin.setEnabled(false);
                Toast toast= Toast.makeText(getApplicationContext(),"YOU ARE NOT PERMITTED TO USE THIS PAGE",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
                toast .show();
            }
        }

    }
}