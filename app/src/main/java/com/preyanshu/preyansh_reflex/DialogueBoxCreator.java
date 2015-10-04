package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;


public class DialogueBoxCreator extends DialogFragment {
    private String title;
    private String message;
    private String positiveButton;
    private String negativeButton;
    private Activity activity;


    public DialogueBoxCreator() {

    }



    public void getStuff(String title, String message, String positiveButton, String negativeButton) {
        this.title = title;
        this.message = message;
        this.positiveButton = positiveButton;
        this.negativeButton= negativeButton;
        //this.activity=activity;
    }

    @Override
    public Dialog onCreateDialog(Bundle b) {
        // Use the Builder class for convenient dialog construction
        //all needs to be referenced
        AlertDialog.Builder PlayGamepopup = new AlertDialog.Builder(getActivity());
        PlayGamepopup.setCancelable(false);
        PlayGamepopup.setTitle(title);
        PlayGamepopup.setMessage(message);
        PlayGamepopup.setPositiveButton(positiveButton, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // if this button is clicked, close
                // current activity
            }
        });
        PlayGamepopup.setNegativeButton(negativeButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                // if this button is clicked, just close
                // the dialog box and do nothing
                dialog.cancel();
            }
        });

        return PlayGamepopup.create();
    }

}
