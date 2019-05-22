package com.doc.afis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Scan extends AppCompatActivity {

    Button btnScan, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_scan);

        btnScan = findViewById(R.id.screen_thumbs);
        btnScan = findViewById(R.id.reset_thumbs);

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnReset.setVisibility(View.INVISIBLE);
                Toast.makeText(Scan.this, "Reset is disabled", Toast.LENGTH_LONG).show();
            }
        });
    }
}
