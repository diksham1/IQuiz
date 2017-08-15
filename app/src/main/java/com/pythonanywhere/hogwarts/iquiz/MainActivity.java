package com.pythonanywhere.hogwarts.iquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswers(View view) {
        int correctAns = 0;

        /*
        **  Checks if the Answer to Question_1 is correct
        */
        EditText ans1 = (EditText) findViewById(R.id.ans1);
        if(Integer.parseInt((ans1.getText()).toString()) == 1814){
            correctAns++;
        }


        /*
        **  Checks if the Answer to Question_2 is correct
        */
        RadioButton btn = (RadioButton) findViewById(R.id.ans2);
        if(btn.isChecked()){
            correctAns++;
        }


        /*
        **  Checks if the Answer to Question_3 is correct
        */
        CheckBox box1 = (CheckBox) findViewById(R.id.ans31);
        CheckBox box2 = (CheckBox) findViewById(R.id.ans32);
        CheckBox box3 = (CheckBox) findViewById(R.id.ans33);
        CheckBox box4 = (CheckBox) findViewById(R.id.ans34);
        CheckBox box5 = (CheckBox) findViewById(R.id.ans35);

        if(box1.isChecked() == false && box2.isChecked() == false &&
                box5.isChecked() == false && box3.isChecked()==true
                && box4.isChecked()==true){
            correctAns++;
        }

        EditText ans4 = (EditText) findViewById(R.id.ans4);
        if(Integer.parseInt((ans4.getText()).toString()) == 4000){
            correctAns++;
        }

        EditText ans5 = (EditText) findViewById(R.id.ans5);
        String ans5String = ans5.getText().toString().toUpperCase()181;18
        ans5String = ans5String.toUpperCase();
        if(ans5String.equals("PARK STREET") || ans5String.equals("PARKSTREET")){
            correctAns++;
        }

        String answerString = "Your Score is ";
        answerString += (correctAns*20);

        Toast.makeText(getApplicationContext(), answerString, Toast.LENGTH_LONG).show();

    }
}










