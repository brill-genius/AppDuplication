package com.example.cs2001gp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cs2001gp.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
    }

    public void onAskQuestionClick(View view){

        Intent getModulesActivityIntent = new Intent(this,
                ModulesActivity.class);

        final int result = 1;

        getModulesActivityIntent.putExtra("callingActivity","MainActivity");

        startActivityForResult(getModulesActivityIntent, result);
    }
}
