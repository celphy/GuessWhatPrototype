package org.intsys.madyto.guesswhatprototype;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CurrentgameActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

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
                Intent takePictureIntent = new Intent(
                    MediaStore.ACTION_IMAGE_CAPTURE
                );

                if(takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    CurrentgameActivity.this.startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }
            }
        });

        Button chatBtn = (Button) findViewById(R.id.btnStartChat);
        chatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToChatIntent = new Intent(CurrentgameActivity.this, ChatActivity.class);
                CurrentgameActivity.this.startActivity(goToChatIntent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        Intent goToIngameAfterIntent = new Intent(
                CurrentgameActivity.this,
                IngameActivity.class);
        CurrentgameActivity.this.startActivity(goToIngameAfterIntent);
    }

    @Override
    public void onBackPressed(){
        Intent goToMainActivityItent = new Intent(
                CurrentgameActivity.this,
                MainActivity.class);
        CurrentgameActivity.this.startActivity(goToMainActivityItent);
    }
}
