package org.intsys.madyto.guesswhatprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);


        Button rtnMainBtn = (Button) findViewById(R.id.btnReturnMain);
        rtnMainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToMainIntent = new Intent(StatsActivity.this, MainActivity.class);
                StatsActivity.this.startActivity(goToMainIntent);
            }
        });
    }
}
