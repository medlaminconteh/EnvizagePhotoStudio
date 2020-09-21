package com.example.envizagephotostudio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeMainActivity2 extends AppCompatActivity {
ImageView inputDetail, admin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main2);
        inputDetail=findViewById(R.id.input);
        admin=findViewById(R.id.imgAdmin);

        inputDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainIntent1 = new Intent(HomeMainActivity2.this, webViewActivity.class);
                HomeMainActivity2.this.startActivity(mainIntent1);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(HomeMainActivity2.this, adminLogin.class);
                HomeMainActivity2.this.startActivity(int1);
            }
        });


    }
}