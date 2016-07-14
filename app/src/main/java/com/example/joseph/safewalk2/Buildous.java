package com.example.joseph.safewalk2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.Toast;

public class Buildous extends AppCompatActivity {

    public String txtSelected = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Declaring shit
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buildous_deliverous);
        Button sendBuilding = (Button) findViewById(R.id.btnSendBuilding);

        //Setting the values on the spinner
        Spinner spinner = (Spinner) findViewById(R.id.buildingSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.buildingsArray, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //Checking what's selected on the spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object test = parent.getItemAtPosition(position);
                txtSelected = test.toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Sending the building
        sendBuilding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.txtTest);
                txtView.setText(txtSelected);

                //Sending the sms message
                Log.i("Send SMS", "");
                String phoneNo = "3054580416";
                String message = "Holy fuck it worked";

                try {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(phoneNo, null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                }

                catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "SMS faild, please try again.", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

    }
}
