package com.example.cs2001gp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LecturesActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lectures_layout);


    }

    public void onWeek1ButtonClick(View view) {

        Intent getQuestionsScreenIntent = new Intent(this,
                QuestionsActivity.class);

        final int result = 1;

        startActivity(getQuestionsScreenIntent);
    }
}
