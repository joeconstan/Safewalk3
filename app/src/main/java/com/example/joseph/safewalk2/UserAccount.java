package com.example.joseph.safewalk2;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserAccount extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_account);


        final EditText username = (EditText) findViewById(R.id.username);
        final EditText password = (EditText) findViewById(R.id.password);

        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(v.getContext(), Register.class);
                startActivity(inten);
            }
        });

        Button loginSubmitButton = (Button) findViewById(R.id.loginSubmitButton);
        loginSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String u = username.getText().toString();
                String p = password.getText().toString();
                if (u.compareTo("admin") == 0 && p.compareTo("ither22") == 0) {
                    Intent intent = new Intent(view.getContext(), AdminMain.class);
                    startActivity(intent);
                }
            }
        });


    }


}
