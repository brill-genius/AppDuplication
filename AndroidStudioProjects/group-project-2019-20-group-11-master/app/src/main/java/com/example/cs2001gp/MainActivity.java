package com.example.cs2001gp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int likesCounter;
    private Button CS2001_button;
    private Button CS2002_button;
    private Button CS2003_button;
    private Button CS2005_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CS2001_button = (Button) findViewById(R.id.CS2001_button);

//        CS2001_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opencs2001();
//
//            }
//        });

//        CS2002_button = (Button) findViewById(R.id.CS2002_button);
//        CS2002_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opencs2002();
//
//            }
//        });

//        CS2003_button = (Button) findViewById(R.id.CS2003_button);
//        CS2003_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opencs2003();
//
//            }
//        });

        //below this
//        CS2005_button = (Button) findViewById(R.id.CS2005_button);
//        CS2005_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                opencs2005();
//
//            }
//
//
//            //above this
//        });
    }

    public void onAskQuestionClick(View view) {

        Intent getModulesActivityIntent = new Intent(this,
                ModulesActivity.class);

        final int result = 1;

        getModulesActivityIntent.putExtra("callingActivity", "MainActivity");

        startActivity(getModulesActivityIntent);

    }

//    public void opencs2001() {
//        Intent intent = new Intent(this, cs2001.class);
//        startActivity(intent);
//    }
//
//    public void opencs2002() {
//        Intent intent = new Intent(this, cs2002.class);
//        startActivity(intent);
//    }
//
//    public void opencs2003() {
//        Intent intent = new Intent(this, cs2003.class);
//        startActivity(intent);
//    }
//
//    public void opencs2005() {
//        Intent intent = new Intent(this, cs2003.class);
//        startActivity(intent);
//    }
    


    public void on_likebutton_click(View view){
        incrementLikes(likesCounter);
    }

    public static int incrementLikes(int currentQnScore) {
        currentQnScore += 1;
        return currentQnScore;
    }


    public static boolean isvalidStudentID(String userEmail) {
        if (isvalidBrunelEmail(userEmail) == false ) {
            return false;
        }

        //splits student ID from email
        //counts number of characters in the student ID
        String[] parts = userEmail.split("\\@");
        String studentID = parts[0];

        boolean sevenChar, IDNumeric;
        sevenChar = is7Char(studentID);
        IDNumeric = isNumeric(studentID);

        if((sevenChar == true) && (IDNumeric == true)) {
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean isvalidBrunelEmail(String userEmail) {
        //what if there's more than one or typo in the brunel email?
        if( userEmail.contains("@brunel.ac.uk")){
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean is7Char(String studentID) {
        //checks for student ID
        int studentIDLength = studentID.length();
        if (studentIDLength == 7 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isNumeric(String strNum) {
        //check student number
        if (strNum == null) {
            return false;
        }
        try {
            int studentIDint = Integer.parseInt(strNum);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }

}
