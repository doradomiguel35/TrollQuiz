package com.uic.prelimexam.dorado;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText_username;
    Button button_start, button_tally;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.uic.prelimexam.dorado.R.layout.activity_main);



        editText_username = (EditText) findViewById(com.uic.prelimexam.dorado.R.id.editText_username);
        button_start = (Button) findViewById(com.uic.prelimexam.dorado.R.id.button_start);
        button_tally = (Button) findViewById(com.uic.prelimexam.dorado.R.id.button_tally);


        if(uicGetSharedPreferenceValue("userInfo", "username").isEmpty()){
            button_tally.setEnabled(false);
        }

        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uicSetSharedPreferenceValue("userInfo", "username", editText_username.getText().toString());
                name = editText_username.getText().toString();

                if(name.isEmpty()){
                    uicToastMessage("Type Username");
                }

                else {
                    Intent intent = new Intent(MainActivity.this, BugtongActivity.class);
                    startActivity(intent);

                }

            }
        });

        button_tally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TallyActivity.class));
            }
        });


    }

    @Override
    public void onBackPressed() {
        uicDialogQuit();
    }



    public void uicDialogQuit(){
        AlertDialog.Builder altExit = new AlertDialog.Builder(MainActivity.this);
        altExit.setMessage("Do you want to close this app?").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //finish();
                        finishAffinity();
                        android.os.Process.killProcess(android.os.Process.myPid());
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alert = altExit.create();
        alert.setTitle("Closing Activity");
        alert.show();
    }

    public void uicToastMessage(String message){
        Toast.makeText(this, message ,Toast.LENGTH_SHORT).show();
    }

    public void uicSetSharedPreferenceValue(String sharedPrefName, String key, String value){
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPrefName, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String uicGetSharedPreferenceValue(String sharedPrefName, String key){
        SharedPreferences sharedPreferences = getSharedPreferences(sharedPrefName, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString(key, "");
        return value;
    }
}
