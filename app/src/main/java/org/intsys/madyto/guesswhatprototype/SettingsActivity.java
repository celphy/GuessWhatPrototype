package org.intsys.madyto.guesswhatprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Button rtnMainBtn = (Button) findViewById(R.id.btnReturnMain);
        rtnMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMainIntent = new Intent( SettingsActivity.this, MainActivity.class);
                SettingsActivity.this.startActivity(goToMainIntent);
            }
        });

        Button highscoreBtn = (Button) findViewById(R.id.btnHighscore);
        highscoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToHighscoreIntent = new Intent( SettingsActivity.this, HighscoreActivity.class);
                SettingsActivity.this.startActivity(goToHighscoreIntent);
            }
        });

    }
}
