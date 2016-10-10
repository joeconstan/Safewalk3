package com.example.joseph.safewalk2;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GetInfo extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_info);

        final EditText nameInfo = (EditText) findViewById(R.id.nameInfo);
        final EditText numberInfo = (EditText) findViewById(R.id.numberInfo);

        final SharedPreferences prefs = getPreferences(Context.MODE_PRIVATE);

        Button nextInfo = (Button) findViewById(R.id.nextInfoButton);
        nextInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prefs.edit().putString("name", nameInfo.getText().toString()).apply();
                prefs.edit().putString("number", numberInfo.getText().toString()).apply();
                Intent intent = new Intent(view.getContext(), Details.class);
                startActivity(intent);
            }
        });


    }

}
