package com.fju.member;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private EditText edNic;
    private EditText edAge;
    private EditText edGen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNic = findViewById(R.id.user_nickname);
        edAge = findViewById(R.id.user_age);
        edGen = findViewById(R.id.nickname);
//        String nic = edNic.getText().toString();
//        String age = edAge.getText().toString();
//        String gen = edGen.getText().toString();

        intent = new Intent(this,NicknameActivity.class);
    }
    public void ok(View view){
        startActivityForResult(intent,4);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK) {
            edNic.setText(getSharedPreferences("test", MODE_PRIVATE).getString("NICKNAME", ""));
            edAge.setText(getSharedPreferences("test", MODE_PRIVATE).getString("AGE", ""));
            edGen.setText(getSharedPreferences("test", MODE_PRIVATE).getString("GENDER", ""));
        }else {
            finish();
        }
    }
}
