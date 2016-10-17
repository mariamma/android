package com.example.manto9.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    public final static String EXTRA_USER = "com.example.manto9.myapplication.USERNAME";
    public final static String EXTRA_PASS = "com.example.manto9.myapplication.PASS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String username = intent.getStringExtra(EXTRA_USER);
        String password = intent.getStringExtra(EXTRA_PASS);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(username);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_main2);
        layout.addView(textView);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
