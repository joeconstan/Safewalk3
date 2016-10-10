package com.example.joseph.safewalk2;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

public class LocationDeliverous extends AppCompatActivity{

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
                try{
                    SmsManager smsManager = SmsManager.getDefault();
                    String message = name + "needs a walk, their # is " + source;
                    String phoneNo = "16613421687";
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                }
                catch(Exception e){
                    e.printStackTrace();
                }

            }
        });
    }

}


