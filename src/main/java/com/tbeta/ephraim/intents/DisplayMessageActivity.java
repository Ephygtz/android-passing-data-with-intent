package com.tbeta.ephraim.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        //Get the intent that started this activity and extract the string
        Intent intent = getIntent();
        String display = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        ////Capture the layouts textview and set the string as its text
        TextView textView = (TextView) findViewById(R.id.dissplayMessage);
        textView.setText(display);
        Toast.makeText(this, display, Toast.LENGTH_SHORT).show();

    }
}
