package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private EditText nick;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
        intent = new Intent("");
//        findViewById(R.id.inext).setOnClickListener();
        nick = findViewById(R.id.nickname);
    }
    public void commit(View view){
        String nickname = nick.getText().toString();
        SharedPreferences pref = getSharedPreferences("test",MODE_PRIVATE);
        pref.edit()
                .putString("NICKNAME",nickname)
                .commit();
        startActivity(intent);
        setResult(RESULT_OK);
        finish();

    }
}
