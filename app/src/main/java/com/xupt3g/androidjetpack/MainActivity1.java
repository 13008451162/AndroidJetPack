package com.xupt3g.androidjetpack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

    }

    public MainActivity1(int contentLayoutId) {
        super(contentLayoutId);
    }
}