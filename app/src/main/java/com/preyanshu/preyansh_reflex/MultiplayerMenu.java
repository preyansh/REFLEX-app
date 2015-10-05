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
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MultiplayerMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_multiplayer_menu, menu);
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
    public void TwoPlayerButton(View view){
        Intent TwoPlyrBzr=new Intent(this, BuzzerGame.class);
            TwoPlyrBzr.putExtra("MPlayerMode", 2);
            startActivity(TwoPlyrBzr);
    }
    public void ThreePlayerButton(View view){
        Intent ThreePlyrBzr=new Intent(this, BuzzerGame.class);
            ThreePlyrBzr.putExtra("MPlayerMode", 3);
            startActivity(ThreePlyrBzr);

    }
    public void FourPlayerButton(View view){
        Intent FourPlyrBzr=new Intent(this, BuzzerGame.class);
            FourPlyrBzr.putExtra("MPlayerMode", 4);
            startActivity(FourPlyrBzr);
    }
}
