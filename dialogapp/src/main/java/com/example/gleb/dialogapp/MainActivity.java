package com.example.gleb.dialogapp;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onStartDialogClick(View view){
        FragmentManager manager = getSupportFragmentManager();
        MyDialogFragment myDialogFragment = new MyDialogFragment();
        myDialogFragment.show(manager, "dialog");
    }

    public void okClicked() {
    }

    public void neutralClicked() {
    }

    public void negativeClicked() {
    }
}
