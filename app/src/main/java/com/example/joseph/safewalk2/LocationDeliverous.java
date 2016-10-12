package com.example.joseph.safewalk2;


import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LocationDeliverous extends AppCompatActivity{

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_deliverous);

        Button deliverousSubmitButton = (Button) findViewById(R.id.deliverousSubmitButton);
        deliverousSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
                String name = "";
                sharedPref.getString(name, "name");
                String source = "";
                sharedPref.getString(source, "number");

            }
        });
    }



}


