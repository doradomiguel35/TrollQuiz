package com.uic.prelimexam.dorado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Noob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noob);

        Button btn_continue;
        TextView txtView_score;

        btn_continue = (Button) findViewById(R.id.btnotbad_continue);
        txtView_score = (TextView) findViewById(R.id.textNoob_Score);

        txtView_score.setText(""+TrollQuiz.answered);
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToTally = new Intent(Noob.this,TallyActivity.class);
                startActivity(goToTally);
                finish();
            }
        });
    }
}
