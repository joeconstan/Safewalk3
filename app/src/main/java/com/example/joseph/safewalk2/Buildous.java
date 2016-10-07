package com.example.joseph.safewalk2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;


public class Buildous extends AppCompatActivity {

    public String txtSelected = "";

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Declaring shit
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buildous_deliverous);

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

    }


}
