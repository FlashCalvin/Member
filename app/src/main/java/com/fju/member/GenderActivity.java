package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {

    private Intent intent;
    private EditText edGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
        intent = new Intent(this,MainActivity.class);
        edGender = findViewById(R.id.gender);
    }
    public void commit3(View view){
        String gender = edGender.getText().toString();
        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        pref.edit()
                .putString("GENDER",gender)
                .commit();
        finish();
    }
}
