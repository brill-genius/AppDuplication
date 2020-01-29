package com.example.cs2001gp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int likesCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void on_likebutton_click(View view){
        incrementLikes(likesCounter);
    }

    public static int incrementLikes(int currentQnScore) {
        currentQnScore += 1;
        return currentQnScore;
    }
}
