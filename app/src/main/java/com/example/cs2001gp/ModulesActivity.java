package com.example.cs2001gp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.cs2001gp.R;

public class ModulesActivity extends Activity {




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.modules_layout);

        Intent activityThatCalled = getIntent();

        String previousActivity = activityThatCalled.getExtras().getString("callingActivity");

        // TextView callingActivityMessage = (TextView)
        //findViewById(R.id.calling_activity_info_text_view);

        //callingActivityMessage.append(" " + previousActivity);
    }
}
