package com.example.cs2001gp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class QuestionsActivity extends AppCompatActivity {
    EditText et;
    Button bt;
    ListView lv;
    Button backbutton;
    ArrayList<String> arraylist;
    ArrayAdapter<String> Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions_layout);


        backbutton = (Button) findViewById(R.id.BackBTN);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent in = new Intent();
                new Intent(QuestionsActivity.this, ModulesActivity.class);
                startActivity(in);


            }
        });


        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setTitle("Questions Activity");

        //Button BackBTN = (Button)findViewById(R.id.BackBTN);
        //BackBTN.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //public void onClick(View v) {
        // startActivity(new Intent(QuestionsActivity.this,ModulesActivity.class));
        // }
        //});

        et = (EditText) findViewById(R.id.Questiontxt);
        bt = (Button) findViewById(R.id.Submitbtn);
        lv = (ListView) findViewById(R.id.Questionlv);

        arraylist = new ArrayList<String>();
        Adapter = new ArrayAdapter<String>(QuestionsActivity.this, android.R.layout.simple_list_item_1,
                arraylist);


        lv.setAdapter(Adapter);


        //public void onBtnClick
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = et.getText().toString().trim();
                arraylist.add(result);
                Adapter.notifyDataSetChanged();

                //public void BackBTN(View view) {

                //startActivity(new Intent(QuestionsActivity.this,ModulesActivity.class));


                // }

            }
        });


    }

    private void createBackButton() {

        Button Next_button = (Button)findViewById(R.id.BackBTN);

        Next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(QuestionsActivity.this, LecturesActivity.class));

            }

        });
        }}