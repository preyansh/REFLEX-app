package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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
    public void ReactionTimeButton(View view){
        Intent ReactionGame=new Intent(this, ReactionGame.class);
            startActivity(ReactionGame);
    }
    public void BuzzerGameButton(View view){
        Intent BuzzerGame=new Intent(this, MultiplayerMenu.class);
            startActivity(BuzzerGame);
    }
    public void StatisticsButton(View view){
        Intent Statistics=new Intent(this, StatisticsMenu.class);
            startActivity(Statistics);
    }
}
