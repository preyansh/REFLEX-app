package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BuzzerGame extends Activity {

    int player1press=0;
    int player2press=0;
    int player3press=0;
    int player4press=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=getIntent();
        Integer NumofPlayers = intent.getIntExtra("MPlayerMode", 0);
        //changes to the xml you want depending on the number of players
        if (NumofPlayers==2){
            setContentView(R.layout.activity_buzzer_game2_player);
        }
        if (NumofPlayers==3){
            setContentView(R.layout.activity_buzzer_game3_player2);
        }
        if (NumofPlayers==3){
            setContentView(R.layout.activity_buzzer_game4_player);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buzzer_game, menu);
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
    public void Player1Button(View view) {
        player1press++;

    }
    public void Player2Button(View view) {  player2press++;}
    public void Player3Button(View view) {
        player3press++;
    }
    public void Player4Button(View view) {
        player4press++;
    }
}
