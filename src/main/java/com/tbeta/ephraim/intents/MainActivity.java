package com.tbeta.ephraim.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static  final String EXTRA_MESSAGE = "com.tbeta.ephraim.intents";
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button) findViewById(R.id.submitBtn);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMessage();
            }
        });

    }


    //    Called when athe user taps the send button
    public void sendMessage() {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText name = (EditText) findViewById(R.id.inputName);
        String message = name.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

}













