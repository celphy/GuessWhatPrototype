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
                finish();
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

    }

}
