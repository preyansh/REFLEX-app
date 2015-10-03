package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class DialogueBoxCreator extends DialogFragment {
    String title;
    String message;
    String positiveButton;


    public DialogueBoxCreator(String title, String message, String positiveButton) {
        this.title = title;
        this.message = message;
        this.positiveButton = positiveButton;
    }


    public Dialog onCreateDialogue(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        //all needs to be referenced
        AlertDialog.Builder PlayGamepopup = new AlertDialog.Builder(getActivity());
        PlayGamepopup.setTitle(title);
        PlayGamepopup.setMessage(message);
        PlayGamepopup.setPositiveButton(positiveButton, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // if this button is clicked, close
                // current activity
            }
        });
        /*PlayGamepopup.setNegativeButton(negativeButton, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog.int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
        });*/
        PlayGamepopup.setCancelable(false);
        return PlayGamepopup.create();
    }
}
