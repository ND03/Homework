package com.example.namig.volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import android.view.View.OnTouchListener;
import android.app.Activity;


public class MainActivity extends AppCompatActivity implements OnTouchListener {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.text);
        txt.setOnTouchListener(this);


    }
    @Override
    public boolean onTouch(View v, MotionEvent event)
    {

        float x;
        float y;
        x = event.getX();
        y = event.getY();

        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            txt.setText("DOWN");
        }
        else if (event.getAction() == MotionEvent.ACTION_UP)
        {
            txt.setText("UP");
        }
        else if (event.getAction() == MotionEvent.ACTION_MOVE)
        {
            txt.setText("move: " + x + " " + y);
        }
        return true;
    }
}
