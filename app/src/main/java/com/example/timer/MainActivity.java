package com.example.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView duration=(TextView) findViewById(R.id.duration);
        final TextView status =(TextView) findViewById(R.id.status);
        new CountDownTimer(10000,1000)
        {

            public void onTick(long milliseconduntildone)
            {
              duration.setText("time left :"+ String.valueOf(milliseconduntildone/1000));
            }
            public void onFinish()
            {
                status.setText("Done!!!");
            }
        }.start();
    }
}
