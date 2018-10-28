package com.example.gleb.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast();
    }

    void showToast(){
        Toast toast3 = Toast.makeText(getApplicationContext(), "This is second lesson!", Toast.LENGTH_LONG);
        toast3.setGravity(Gravity.CENTER,0,0);
        LinearLayout toastContainer = (LinearLayout) toast3.getView();
        ImageView imageView = new ImageView(getApplicationContext());
        imageView.setImageResource(R.mipmap.ic_launcher);
        toastContainer.addView(imageView,0);
        toast3.show();
    }
}
