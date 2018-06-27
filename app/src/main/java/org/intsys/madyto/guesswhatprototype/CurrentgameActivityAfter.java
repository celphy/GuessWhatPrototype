package org.intsys.madyto.guesswhatprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CurrentgameActivityAfter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currentgame_after);

        Button rtnMainBtn = (Button) findViewById(R.id.btnReturnMain);
        rtnMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Button highscoreBtn = (Button) findViewById(R.id.btnHighscore);
        highscoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHighscoreIntent = new Intent( CurrentgameActivityAfter.this, HighscoreActivity.class);
                CurrentgameActivityAfter.this.startActivity(goToHighscoreIntent);
            }
        });


        Button settingsBtn = (Button) findViewById(R.id.btnSettings);
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSettingsIntent = new Intent(CurrentgameActivityAfter.this, SettingsActivity.class);
                CurrentgameActivityAfter.this.startActivity(goToSettingsIntent);
            }
        });

        Button playCurrentGameButton = (Button) findViewById(R.id.btnCurrentGamePlay);
        playCurrentGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToIngameIntent = new Intent(
                        CurrentgameActivityAfter.this,
                        IngameActivity.class);
                CurrentgameActivityAfter.this.startActivity(goToIngameIntent);
            }
        });

        Button chatBtn = (Button) findViewById(R.id.btnStartChat);
        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToChatIntent = new Intent(CurrentgameActivityAfter.this, ChatActivity.class);
                CurrentgameActivityAfter.this.startActivity(goToChatIntent);
            }
        });

    }


    @Override
    public void onBackPressed(){
        Intent goToMainActivityItent = new Intent(
                CurrentgameActivityAfter.this,
                MainActivity.class);
        CurrentgameActivityAfter.this.startActivity(goToMainActivityItent);
    }
}
