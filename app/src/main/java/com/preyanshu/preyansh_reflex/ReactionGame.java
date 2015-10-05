/*Copyright 2015 Preyanshu Kumar

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/

package com.preyanshu.preyansh_reflex;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
//import android.content.DialogFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import static android.os.SystemClock.currentThreadTimeMillis;
import java.util.Timer;
import java.util.Random;

public class ReactionGame extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //global strings for welcome box
        final String WelcomeTitle = getResources().getString(R.string.reaction_time_button);
        String WelcomeMsg = getResources().getString(R.string.Popup_menu_Reaction_game);
        final String ChoiceGo = getResources().getString(R.string.Play_button);
        final String ChoiceStop = getResources().getString(R.string.Quit_Button);
        //strings for the a too fast instance
        String TooFast = getResources().getString(R.string.TooFastPress);
        String TooFastMsg = getResources().getString(R.string.WaitColor);
        String GotIt = getResources().getString(R.string.Got_it);
        final String Time=getResources().getString(R.string.YourTimeIs);
        final String MS=getResources().getString(R.string.Milli);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reaction_game);

        //making all the dialogues starting with welcome, then too fast then ontime
        DialogueBoxCreator welcome_box = new DialogueBoxCreator();
        welcome_box.getStuff(WelcomeTitle, WelcomeMsg, ChoiceGo, ChoiceStop);
        welcome_box.show(getFragmentManager(), "welcome_box");

        final DialogueBoxCreator too_quick = new DialogueBoxCreator();
        too_quick.getStuff(TooFast, TooFastMsg, GotIt, ChoiceStop);

        Integer minimum = 10;
        Integer maximum = 2000;
        Random number = new Random();
        Integer waitBeforeClick = number.nextInt(maximum + 1);

        final Button button_press = (Button) findViewById(R.id.reactionbutton);

        class TimedButton extends CountDownTimer {
            //need a starting time and the time till click
            protected long timeRemaining;
            protected long timeStart = currentThreadTimeMillis();

            //constructor class
            public TimedButton(long timeComing, long countDownInterval) {
                super(timeComing, countDownInterval);
            }

            //gives us our time remaining
            public long getTimeRemaining() {
                return timeRemaining;
            }

            //counts our time elapsed
            public long getTimedone() {
                return currentThreadTimeMillis() - timeStart;
            }

            //must override the prebuilt classes of ReactionTimer
            @Override
            public void onTick(long timeLeft) {
                timeRemaining = timeLeft;
            }

            @Override
            public void onFinish() {
                button_press.setBackgroundColor(Color.parseColor("FFFF041B"));
            }
        }
        //create a new instance, called waiting to be a new timed button, this is our random before we have to click
        final TimedButton waiting = new TimedButton(waitBeforeClick, 1000);
        waiting.start();

        button_press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //early click!
                if (waiting.getTimeRemaining()>0){
                    too_quick.show(getFragmentManager(), "too_quick");
                    waiting.cancel();
                    waiting.start();
                }
                //good click!
                else {
                    Long time_fin = currentThreadTimeMillis() - waiting.getTimedone();
                    DialogueBoxCreator just_right = new DialogueBoxCreator();
                    just_right.getStuff(Time, time_fin + "ms", ChoiceGo, ChoiceStop);
                    just_right.show(getFragmentManager(), "finish");
                }



            }
        });


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
