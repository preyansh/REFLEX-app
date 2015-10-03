package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ReactionGame extends Activity {

    String WelcomeTitle=getString(R.string.reaction_time_button);
    String WelcomeMsg=getString(R.string.Popup_menu_Reaction_game);
    String Choice=getString(R.string.Play_button);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction_game);
        DialogueBoxCreator welcome_box = new DialogueBoxCreator(WelcomeTitle,WelcomeMsg, Choice);

        welcome_box.show(getFragmentManager(), "welcomeBoxTag");
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
