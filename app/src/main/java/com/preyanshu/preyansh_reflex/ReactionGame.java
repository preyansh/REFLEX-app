package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
//import android.content.DialogFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ReactionGame extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String WelcomeTitle=getResources().getString(R.string.reaction_time_button);
        String WelcomeMsg=getResources().getString(R.string.Popup_menu_Reaction_game);
        String ChoiceGo=getResources().getString(R.string.Play_button);
        String ChoiceStop=getResources().getString(R.string.Quit_Button);
        //Activity dialogue_activity= new Activity();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction_game);

        DialogueBoxCreator welcome_box = new DialogueBoxCreator();
        welcome_box.getStuff(WelcomeTitle, WelcomeMsg, ChoiceGo, ChoiceStop);
        welcome_box.show(getFragmentManager(), "welcome_box");
        //welcome_box.onCreateDialogue(WelcomeMsg);

    }


        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reaction_game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
