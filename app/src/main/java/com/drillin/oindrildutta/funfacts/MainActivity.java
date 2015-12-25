package com.drillin.oindrildutta.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    private FactBook getter = new FactBook();
    private ColorWheel painter = new ColorWheel ();
    int color;

    //https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html#foreground.type=text&foreground.space.trim=1&foreground.space.pad=0.35&foreground.text.text=Facts&foreground.text.font=Roboto&foreColor=fff%2C0&crop=0&backgroundShape=circle&backColor=ff9800%2C100&effects=shadow

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RelativeLayout background = (RelativeLayout) findViewById(R.id.backg);
        final TextView factLabel = (TextView) findViewById(R.id.fact);
        final Button showButton = (Button) findViewById(R.id.newfact);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                factLabel.setText(getter.getFact()); //Button clicked, show new fact.
                color = painter.getColor();
                background.setBackgroundColor(color);
                showButton.setTextColor(color);
                //Toast.makeText(getApplicationContext(), "New Fact " + System.currentTimeMillis()/1000, Toast.LENGTH_SHORT).show();
                //Log.d(TAG, getter.urlFact());
            }
        });

        //Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show();
        //Log.d(TAG, "Main Activity Created");
    }

    @Override
    public void onStart() {
        super.onStart();
        final RelativeLayout background = (RelativeLayout) findViewById(R.id.backg);
        final Button showButton = (Button) findViewById(R.id.newfact);
        background.setBackgroundColor(Color.parseColor("#ff9800"));
        showButton.setTextColor(Color.parseColor("#ff9800"));
        //Toast.makeText(this, "Opened", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
