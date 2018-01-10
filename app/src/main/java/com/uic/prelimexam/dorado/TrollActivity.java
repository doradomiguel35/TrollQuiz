package com.uic.prelimexam.dorado;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TrollActivity extends AppCompatActivity {

    Button button_stop, button_A, button_B, button_C, button_D;
    TextView textView_time, textView_currentUsername, textView_questions,textView_answered;
    EditText editText_question;
    int intID;
    int repetition;

    DatabaseHelper databaseHelper;
    public static String currentUsername;

    CountDownTimer timer;
    TrollQuiz trollQuiz;
    long remainingSeconds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.uic.prelimexam.dorado.R.layout.activity_bugtong);


        textView_time = (TextView) findViewById(com.uic.prelimexam.dorado.R.id.textView_time);
        textView_currentUsername = (TextView) findViewById(com.uic.prelimexam.dorado.R.id.textView_currentUsername);
        textView_questions = (TextView) findViewById(com.uic.prelimexam.dorado.R.id.textView_questions);
        textView_answered = (TextView) findViewById(com.uic.prelimexam.dorado.R.id.textView_answered);
        editText_question = (EditText) findViewById(com.uic.prelimexam.dorado.R.id.editText_question);
        button_A = (Button) findViewById(com.uic.prelimexam.dorado.R.id.button_A);
        button_B = (Button) findViewById(com.uic.prelimexam.dorado.R.id.button_B);
        button_C = (Button) findViewById(com.uic.prelimexam.dorado.R.id.button_C);
        button_D = (Button) findViewById(com.uic.prelimexam.dorado.R.id.button_D);
        trollQuiz = new TrollQuiz();


        databaseHelper = new DatabaseHelper(this);

        //String currentUsername = uicGetIntentExtra("currentUsername");
        currentUsername = uicGetSharedPreferenceValue("userInfo","username");
        textView_currentUsername.setText(currentUsername);

        uicCountDown(textView_time, 180);
        generateBugtong();
//      TrollQuiz.SCORE = 50;

        button_stop = (Button) findViewById(com.uic.prelimexam.dorado.R.id.button_stop);
        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --TrollQuiz.answered;
                saveUserData();
            }
        });

        textView_questions.setText("/50");
        textView_answered.setText(""+ TrollQuiz.answered++);


        button_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("A");
            }
        });

        button_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("B");
            }
        });

        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("C");
            }
        });

        button_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkUserAnswer("D");
            }
        });


    }

    public void generateBugtong(){
        int currentIndex = trollQuiz.questionAnswered;
        editText_question.setText(trollQuiz.getBugtong(currentIndex));
        button_A.setText(trollQuiz.getChoices(currentIndex,0));
        button_B.setText(trollQuiz.getChoices(currentIndex,1));
        button_C.setText(trollQuiz.getChoices(currentIndex,2));
        button_D.setText(trollQuiz.getChoices(currentIndex,3));
        if(TrollQuiz.questionAnswered>=(trollQuiz.TOTAL_SIZE-1)){
            saveUserData();
        }else{
            TrollQuiz.questionAnswered++;
        }
    }

    public void checkUserAnswer(String choice){
//        int currentIndex = TrollQuiz.questionShown;
        int currentIndex = TrollQuiz.questionAnswered;
        if(trollQuiz.answer[currentIndex-1].equalsIgnoreCase(choice)){
            MediaPlayer correct  = MediaPlayer.create(TrollActivity.this,R.raw.correct);
            correct.start();
            setAnswerCorrect();
        }else{
            MediaPlayer incorrect  = MediaPlayer.create(TrollActivity.this,R.raw.incorrect);
            incorrect.start();
            generateBugtong();
        }
//        textView_score.setText(TrollQuiz.SCORE+"");
    }

    public void setAnswerCorrect(){
        textView_answered.setText(""+TrollQuiz.answered++);
        uicToastMessage("Correct");
//        TrollQuiz.SCORE += (10 * (int) remainingSeconds);
        generateBugtong();

    }

    public void saveUserData(){
        int answered = TrollQuiz.answered;
        String user = databaseHelper.isUserExists(currentUsername,TrollQuiz.answered);
        Cursor getID = databaseHelper.getItemID(currentUsername);

        while (getID.moveToNext()){
            intID = getID.getInt(0);
        }

        if(user.equals("")) {
//            --TrollQuiz.answered;
            addtoTally();
        }

        else{
//            --TrollQuiz.answered ;
            databaseHelper.updateScore(intID,TrollQuiz.answered);
//            uicToastMessage("Score updated");
//            startActivity(new Intent(TrollActivity.this, TallyActivity.class));
            if(answered <= 10){
                startActivity(new Intent(TrollActivity.this, Noob.class));
            }

            else if(answered > 10 && answered <= 40){
                startActivity(new Intent(TrollActivity.this,Averaged.class));
            }

            else if(answered > 40 && answered <=50){
                startActivity(new Intent(TrollActivity.this,MLG.class));
            }
        }

    }

    public void addtoTally(){
        int answered = TrollQuiz.answered;
        MediaPlayer stop = new MediaPlayer();
        boolean insertData = databaseHelper.addData(currentUsername, TrollQuiz.answered);
        if (insertData) {
            timer.cancel();
            if(answered <=2){
                stop.stop();
                startActivity(new Intent(TrollActivity.this, Noob.class));
            }

            else if(answered > 10 && answered <= 40){
                startActivity(new Intent(TrollActivity.this,Averaged.class));
            }

            else if(answered > 40 && answered <= 50){
                startActivity(new Intent(TrollActivity.this,MLG.class));
            }
//            startActivity(new Intent(TrollActivity.this, TallyActivity.class));
        } else {
            uicToastMessage("Something wrong in your database!");
        }
    }

    public void uicCountDown(final TextView textView, int seconds){
        int timeInSeconds = seconds * 1000;
        timer = new CountDownTimer(timeInSeconds, 1000) {

            public void onTick(long millisUntilFinished) {
                remainingSeconds = (millisUntilFinished / 1000);
                textView.setText(""+remainingSeconds);
            }

            public void onFinish() {
                saveUserData();
            }
        }.start();
    }

    public String uicGetIntentExtraValue(String key){
        Bundle mainActivityExtras = getIntent().getExtras();
        String value = mainActivityExtras.getString(key);
        return value;
    }

    public String uicGetSharedPreferenceValue(String sharedPrefName, String key){
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPrefName, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString(key, "");
        return value;
    }

    public void uicToastMessage(String message){
        Toast.makeText(this, message ,Toast.LENGTH_SHORT).show();
    }
}
