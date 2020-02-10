package com.example.cs2001gp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class QuestionsPage0 extends AppCompatActivity {
    EditText et;
    Button bt;
    ListView lv;
    ArrayList<String> arraylist;
    ArrayAdapter<String> Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions_page0);

        et = (EditText)findViewById(R.id.Questiontxt);
        bt = (Button)findViewById(R.id.Submitbtn);
        lv = (ListView)findViewById(R.id.Questionlv);

    }
}
