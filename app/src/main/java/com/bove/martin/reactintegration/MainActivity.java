package com.bove.martin.reactintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bove.martin.reactintegrationlibrary.ReactActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openReact(View view) {
        Intent intent = new Intent(this, ReactActivity.class);
        startActivity(intent);
    }
}