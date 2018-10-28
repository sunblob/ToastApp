package com.example.gleb.dialogapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatDialogFragment;
import android.support.v7.app.AlertDialog;

import java.util.Objects;

public class MyDialogFragment extends AppCompatDialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(Objects.requireNonNull(getActivity()));
        builder.setTitle("Внимание")
                .setMessage("Вам все ясно?")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ((MainActivity) getActivity()).okClicked();
                        dialog.cancel();
                    }
                }).setNeutralButton("Вы о чем?", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                ((MainActivity) getActivity()).neutralClicked();
                dialog.cancel();
            }
        })
         .setNegativeButton("Нет", new DialogInterface.OnClickListener() {
             public void onClick(DialogInterface dialog, int id) {
                 ((MainActivity) getActivity()).negativeClicked();
             }
         }).setCancelable(true);

        return builder.create();
    }
}
