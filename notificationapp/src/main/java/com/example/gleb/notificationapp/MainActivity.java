package com.example.gleb.notificationapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final int MY_NOTIFICATION_ID = 12345;
    private static final int MY_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClickSendNotification(View view){
        NewMessageNotification.notify(getApplicationContext(), "this is mirea", 2);
    }

  /*  @SuppressWarnings("deprecation")
    void onClickSendNotification(View view){
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this);
        notificationBuilder.setAutoCancel(true);
        notificationBuilder.setSmallIcon(R.mipmap.ic_launcher_round);
        notificationBuilder.setTicker("this is mirea");
        notificationBuilder.setWhen(System.currentTimeMillis() + 10 * 1000);
        notificationBuilder.setContentTitle("this is title");
        notificationBuilder.setContentText("this is second lesson...");
        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, MY_REQUEST_CODE,
                intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notificationBuilder.setContentIntent(pendingIntent);
        NotificationManager notificationService =
                (NotificationManager) this.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification = notificationBuilder.build();
        notificationService.notify(MY_NOTIFICATION_ID, notification);
    } */
}
