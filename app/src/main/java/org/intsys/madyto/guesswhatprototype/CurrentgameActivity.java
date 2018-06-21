package org.intsys.madyto.guesswhatprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurrentgameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currentgame);

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
                Intent goToHighscoreIntent = new Intent( CurrentgameActivity.this, HighscoreActivity.class);
                CurrentgameActivity.this.startActivity(goToHighscoreIntent);
            }
        });


        Button settingsBtn = (Button) findViewById(R.id.btnSettings);
        settingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToSettingsIntent = new Intent(CurrentgameActivity.this, SettingsActivity.class);
                CurrentgameActivity.this.startActivity(goToSettingsIntent);
            }
        });

        Button playCurrentGameButton = (Button) findViewById(R.id.btnCurrentGamePlay);
        playCurrentGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToIngameIntent = new Intent(
                        CurrentgameActivity.this,
                        IngameActivity.class);
                CurrentgameActivity.this.startActivity(goToIngameIntent);
            }
        });

    }


    @Override
    public void onBackPressed(){
        Intent goToMainActivityItent = new Intent(
                CurrentgameActivity.this,
                MainActivity.class);
        CurrentgameActivity.this.startActivity(goToMainActivityItent);
    }
}
