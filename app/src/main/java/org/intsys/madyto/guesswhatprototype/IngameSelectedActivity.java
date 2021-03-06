package org.intsys.madyto.guesswhatprototype;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class IngameSelectedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ingame_selected);


        Button continueScreenButton = (Button)findViewById(R.id.continueScreenButton);
        continueScreenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoCurrentGameIntent = new Intent(
                        IngameSelectedActivity.this,
                        CurrentgameActivityAfter.class);
                IngameSelectedActivity.this.startActivity(gotoCurrentGameIntent);
            }
        });
    }
}
