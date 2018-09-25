package com.example.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessage extends AppCompatActivity {

    private TextView textViewDisplayMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        textViewDisplayMessage = findViewById(R.id.textView_revieveMessage_displayMessage);
        textViewDisplayMessage.setText(
                getIntent().getStringExtra(SendMessageActivity.EXTRA_SENT_MESSAGE)
        );


    }
}
