package com.example.onesidedcallrecording_android70;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.wtf("gay", Environment.getExternalStorageDirectory().getAbsolutePath());

        Intent intent1 = new Intent(MainActivity.this, TService.class);
        startService(intent1);
    }
}