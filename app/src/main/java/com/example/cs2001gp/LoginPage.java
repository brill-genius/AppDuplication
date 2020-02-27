package com.example.cs2001gp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cs2001gp.R;

public class LoginPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_layout);


        Button Login_button = (Button) findViewById(R.id.Login_button);

        Login_button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent getMainActivityIntent = new Intent(LoginPage.this,
                        MainActivity.class);

                startActivity(getMainActivityIntent);

            }
        });


    }


}


