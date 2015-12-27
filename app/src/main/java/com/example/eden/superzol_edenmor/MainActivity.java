package com.example.eden.superzol_edenmor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button signup;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = (Button)findViewById(R.id.btnSingIn);
        signup.setOnClickListener(signUpListener);
    }


    private View.OnClickListener signUpListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ManagerActivity.class);
                startActivity(intent);
            }
    };
}

