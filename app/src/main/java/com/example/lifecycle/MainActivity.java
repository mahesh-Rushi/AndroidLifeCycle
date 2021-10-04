package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.DragStartHelper;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mt("Oncreate");
    }


    @Override
    protected void onStart() {
        mt("Start");
        super.onStart();
    }


    @Override
    protected void onResume() {
        mt("Resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        mt("pause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        mt("Stop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        mt("Destory");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        mt("Restart");
        super.onRestart();
    }

    private void mt(String msg){

        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }

}