package com.example.joseph.safewalk2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class Buildous extends AppCompatActivity {

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
                String test2 = test.toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Sending the building

    }
}
