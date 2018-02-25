package com.example.galuhwisnupambayun.galuh_1202150076_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    //Mengatur waktu dari splash screen
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        //Mengatur perpindahan aktivity setelah splash screen dan memunculkan toast
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent menu = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(menu);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
