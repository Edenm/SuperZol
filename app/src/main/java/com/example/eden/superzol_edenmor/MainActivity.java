package com.example.eden.superzol_edenmor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = (Button)findViewById(R.id.btnSingIn);
        signup.setOnClickListener(signUpListener);
    }


         private View.OnClickListener signUpListener = new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent1);
            }
        };
}

