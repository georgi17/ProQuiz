package com.example.android.proquiz;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * Created by georgiana on 09.04.2017.
 */

public class Questions extends Activity {


    private int quizScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        Button submitBtn = (Button) findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                submitAnswers();

                CharSequence resultsDisplay;

                if (quizScore == 7) {
                    resultsDisplay = "Good Job! All answers were correct!";
                } else {
                    resultsDisplay = "Try again. You scored " + quizScore + " out of 7";
                }


                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(Questions.this, resultsDisplay, duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();

            }
        });
    }

    public void verifyQ1() {
        RadioButton Q1_option3 = (RadioButton) this.findViewById(R.id.Q1_answer3);
        boolean answerQ1 = Q1_option3.isChecked();
        if (answerQ1) {
            quizScore++;
        }

    }

    public void verifyQ2() {
        CheckBox Q1_option1 = (CheckBox) this.findViewById(R.id.question2_answer1);
        CheckBox Q2_option2 = (CheckBox) this.findViewById(R.id.question2_answer2);
        CheckBox Q2_option3 = (CheckBox) this.findViewById(R.id.question2_answer3);
        CheckBox Q2_option4 = (CheckBox) this.findViewById(R.id.question2_answer4);
        boolean answer2_option1 = Q1_option1.isChecked();
        boolean answer2_option2 = Q2_option2.isChecked();
        boolean answer2_option3 = Q2_option3.isChecked();
        boolean answer2_option4 = Q2_option4.isChecked();
        if (answer2_option1 && !answer2_option2 && answer2_option3 && !answer2_option4) {
            quizScore++;

        }


    }

    public void verifyQ3() {
        EditText question3_answer = (EditText) this.findViewById(R.id.question3_answer);
        String answer3 = question3_answer.getText().toString().toLowerCase();
        if (answer3.equals("peter beardsley")) {
            quizScore++;
        }


    }

    public void verifyQ4() {
        RadioButton Q4_option2 = (RadioButton) this.findViewById(R.id.question4_answer2);
        boolean answerQ4 = Q4_option2.isChecked();
        if (answerQ4) {
            quizScore++;
        }

    }

    public void verifyQ5() {
        CheckBox Q5_option1 = (CheckBox) this.findViewById(R.id.question5_answer1);
        CheckBox Q5_option2 = (CheckBox) this.findViewById(R.id.question5_answer2);
        CheckBox Q5_option3 = (CheckBox) this.findViewById(R.id.question5_answer3);
        CheckBox Q5_option4 = (CheckBox) this.findViewById(R.id.question5_answer4);
        boolean answer5_option1 = Q5_option1.isChecked();
        boolean answer5_option2 = Q5_option2.isChecked();
        boolean answer5_option3 = Q5_option3.isChecked();
        boolean answer5_option4 = Q5_option4.isChecked();
        if (answer5_option1 && answer5_option2 && !answer5_option3 && !answer5_option4) {
            quizScore++;
        }


    }

    public void verifyQ6() {
        RadioButton Q6_option1 = (RadioButton) this.findViewById(R.id.question6_answer1);
        boolean answerQ6 = Q6_option1.isChecked();
        if (answerQ6) {
            quizScore++;
        }

    }

    public void verifyQ7() {
        EditText question7_answer = (EditText) this.findViewById(R.id.question7_answer);
        String answer7 = question7_answer.getText().toString().toLowerCase();
        if (answer7.equals("the battle of Trafalgar")) {
            quizScore++;
        }


    }


    private void submitAnswers() {
        verifyQ1();
        verifyQ2();
        verifyQ3();
        verifyQ4();
        verifyQ5();
        verifyQ6();
        verifyQ7();
    }


}
