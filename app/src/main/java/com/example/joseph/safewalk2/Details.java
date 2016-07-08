package com.example.joseph.safewalk2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Details extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        //Enter address button
        Button addressButton = (Button) findViewById(R.id.addressButton);
        addressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationDeliverous = new Intent(v.getContext(), LocationDeliverous.class);
                startActivity(locationDeliverous);
            }
        });

        //Select building button
        Button buildingButton = (Button) findViewById(R.id.builingButton);
        buildingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buildous = new Intent(v.getContext(), Buildous.class);
                startActivity(buildous);
            }
        });
    }

}