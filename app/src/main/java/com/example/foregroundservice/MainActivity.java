package com.example.foregroundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.edttxt);
    }

    public void startService(View view) {
        String input=editText.getText().toString().trim();
        Intent serviceIntent=new Intent(this,ExampleService.class);
        serviceIntent.putExtra("input",input);
        startForegroundService(serviceIntent);
    }

    public void stopService(View view) {
        Intent serviceIntent=new Intent(this,ExampleService.class);
        stopService(serviceIntent);
    }
}
