package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class BuzzerGame extends Activity {

    //all the possible modes and clicks, which just need to be ints
    int player1press2player = 0;
    int player2press2player = 0;

    int player1press3player = 0;
    int player2press3player = 0;
    int player3press3player = 0;

    int player1press4player = 0;
    int player2press4player = 0;
    int player3press4player = 0;
    int player4press4player = 0;

    //stuff for dialog boxes
    String Title=getResources().getString(R.string.Win);
    String P1Win=getResources().getString(R.string.Player_1_Press);
    String P2Win=getResources().getString(R.string.Player_2_Press);
    String P3Win=getResources().getString(R.string.Player_3_Press);
    String P4Win=getResources().getString(R.string.Player_4_Press);
    String ChoicePlayAgain=getResources().getString(R.string.Play_Again_Button);
    String ChoiceQuit=getResources().getString(R.string.Quit_Button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Integer NumofPlayers = intent.getIntExtra("MPlayerMode", 0);
        //changes to the xml you want depending on the number of players
        if (NumofPlayers == 2) {
            setContentView(R.layout.activity_buzzer_game2_player);
        }
        if (NumofPlayers == 3) {
            setContentView(R.layout.activity_buzzer_game3_player2);
        }
        if (NumofPlayers == 4) {
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

    

        public void Player1Button (View view){

        //Dialogue box to show if the first player touched first
        DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
        Plyr1Win.getStuff(Title, P1Win, ChoicePlayAgain, ChoiceQuit);
        Plyr1Win.show(getFragmentManager(), "Plyr1Wins");

        //choosing between where to add depending on the game

    }
    public void Player2Button (View view){

        Button P2Click=(Button) findViewById(R.id.Player2Button);

        //Dialogue box to show if the second player touched first
        DialogueBoxCreator Plyr2Win = new DialogueBoxCreator();
        Plyr2Win.getStuff(Title, P2Win, ChoicePlayAgain, ChoiceQuit);
        Plyr2Win.show(getFragmentManager(), "Plyr2Wins");

        //choosing where to add depending on the game

    }
    public void Player3Button (View view){


        Button P3Click=(Button) findViewById(R.id.Player3Button);
        //Dialogue box to show if the third player touched first
        DialogueBoxCreator Plyr3Win = new DialogueBoxCreator();
        Plyr3Win.getStuff(Title,P3Win, ChoicePlayAgain, ChoiceQuit);
        Plyr3Win.show(getFragmentManager(), "Plyr3Wins");

        //choosing where to add depending on the game
    }
    public void Player4Button (View view){

        Button P4Click=(Button) findViewById(R.id.Player4Button);
        //Dialogue box to show if the fourth player touched first
        DialogueBoxCreator Plyr4Win = new DialogueBoxCreator();
        Plyr4Win.getStuff(Title,P4Win, ChoicePlayAgain, ChoiceQuit);
        Plyr4Win.show(getFragmentManager(), "Plyr4Wins");

        //choosing where to add depending on the game
        player4press4player++;
    }
}