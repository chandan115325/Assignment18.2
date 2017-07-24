package com.chandan.android.assignment182;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Receiver is registered statically, This activy starts when app starts." +
                "\n"+"It also starts when USB cable is connected.", Toast.LENGTH_LONG).show();
    }
}
