package com.doc.afis;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static int TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            this.setContentView(R.layout.activity_main);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, Scan.class);
                    startActivity(intent);
                    finish();
                }
            }, TIME_OUT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
