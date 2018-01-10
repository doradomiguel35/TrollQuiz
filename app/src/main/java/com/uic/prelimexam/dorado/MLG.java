package com.uic.prelimexam.dorado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MLG extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlg);

        Button btn_continue;
        TextView txt_score;

        btn_continue = (Button) findViewById(R.id.btnMLG_continue);
        txt_score = (TextView) findViewById(R.id.txtMLG_score);

        txt_score.setText(""+TrollQuiz.answered);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MLG.this,TallyActivity.class));
            }

        });

    }
}
