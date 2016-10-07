

package com.example.joseph.safewalk2;


import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback{


    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button requestWalk = (Button) findViewById(R.id.walkButton);
        requestWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Details.class); //rename intent
                startActivity(intent);
            }
        });


        Button signinButton = (Button) findViewById(R.id.signinButton);
        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(v.getContext(), UserAccount.class); //rename intent
                startActivity(intent3);
            }
        });







    }


}
