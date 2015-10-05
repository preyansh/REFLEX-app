package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.security.PublicKey;

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

    Integer NumofPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //begin the games
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        //dialog box shit
        final String Title=getResources().getString(R.string.Win);
        final String P1Win=getResources().getString(R.string.Player_1_Press);
        final String P2Win=getResources().getString(R.string.Player_2_Press);
        final String P3Win=getResources().getString(R.string.Player_3_Press);
        final String P4Win=getResources().getString(R.string.Player_4_Press);
        final String ChoicePlayAgain=getResources().getString(R.string.Play_Again_Button);
        final String ChoiceQuit=getResources().getString(R.string.Quit_Button);

        NumofPlayers = intent.getIntExtra("MPlayerMode", 0);
        //changes to the xml you want depending on the number of players

        if (NumofPlayers == 2) {
            setContentView(R.layout.activity_buzzer_game2_player);
            //2 player buttons
            //Player one buttons across all modes
            Button P1Press=(Button) findViewById(R.id.Player1Button);
            P1Press.setOnClickListener(new View.OnClickListener() {

                public void onClick (View view) {

                    //choosing between where to add depending on the game
                    player1press2player++;

                    //Dialogue box to show if the first player touched first
                    DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                    Plyr1Win.getStuff(Title, P1Win, ChoicePlayAgain, ChoiceQuit);
                    Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                }
            });
            //Player 2 Button
            Button P2Press=(Button) findViewById(R.id.Player2Button);
            P2Press.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {

                    //choosing between where to add depending on the game
                    player2press2player++;
                    //Dialogue box to show if the first player touched first
                    DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                    Plyr1Win.getStuff(Title, P2Win, ChoicePlayAgain, ChoiceQuit);
                    Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                }
            });

        }

        if (NumofPlayers == 3) {
            //3 player implementation
            setContentView(R.layout.activity_buzzer_game3_player2);
            //player1buttons for 3 player
            Button P1Press = (Button)findViewById(R.id.player1button);

            P1Press.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {

                    //choosing between where to add depending on the game

                    player1press3player++;

                    //Dialogue box to show if the first player touched first
                    DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                    Plyr1Win.getStuff(Title, P1Win, ChoicePlayAgain, ChoiceQuit);
                    Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                }
            });
            //Player 2 Button
            Button P2Press = (Button) findViewById(R.id.player2button);
            P2Press.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {

                    player2press3player++;

                    //Dialogue box to show if the first player touched first
                    DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                    Plyr1Win.getStuff(Title, P2Win, ChoicePlayAgain, ChoiceQuit);
                    Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                }
            });
            //Player 3 Implementations Across 3 and 4 player
            Button P3Press = (Button) findViewById(R.id.player3button);
            P3Press.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view) {

                    //choosing between where to add depending on the game
                    player3press3player++;

                    //Dialogue box to show if the first player touched first
                    DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                    Plyr1Win.getStuff(Title, P3Win, ChoicePlayAgain, ChoiceQuit);
                    Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                }
            });


        }
        if (NumofPlayers == 4) {
                setContentView(R.layout.activity_buzzer_game4_player);

                // 4 player implementation
                //Player one buttons across all modes
                Button P1Press = (Button) findViewById(R.id.Player1Button);
                P1Press.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {

                        //choosing between where to add depending on the game

                        player1press4player++;

                        //Dialogue box to show if the first player touched first
                        DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                        Plyr1Win.getStuff(Title, P1Win, ChoicePlayAgain, ChoiceQuit);
                        Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                    }
                });
                //Player 2 Button
                Button P2Press = (Button) findViewById(R.id.Player2Button);
                P2Press.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {


                        player2press4player++;

                        //Dialogue box to show if the first player touched first
                        DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                        Plyr1Win.getStuff(Title, P2Win, ChoicePlayAgain, ChoiceQuit);
                        Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                    }
                });
                //Player 3 Implementations Across 3 and 4 player
                Button P3Press = (Button) findViewById(R.id.Player3Button);
                P3Press.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {


                        player3press4player++;

                        //Dialogue box to show if the first player touched first
                        DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                        Plyr1Win.getStuff(Title, P3Win, ChoicePlayAgain, ChoiceQuit);
                        Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                    }
                });

                //Player4 Implementation in 4 player mode
                Button P4Press = (Button) findViewById(R.id.Player4Button);
                P4Press.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View view) {

                        //choosing between where to add depending on the game
                        player4press4player++;

                        //Dialogue box to show if the first player touched first
                        DialogueBoxCreator Plyr1Win = new DialogueBoxCreator();
                        Plyr1Win.getStuff(Title, P4Win, ChoicePlayAgain, ChoiceQuit);
                        Plyr1Win.show(getFragmentManager(), "Plyr1Wins");
                    }
                });
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



}