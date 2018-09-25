package com.example.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    private Button buttonSendMessage;
    private EditText editTextMessage;

    public static final String EXTRA_SENT_MESSAGE = "themessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        wireWidgets();
        buttonSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get text from edittext
                String message = editTextMessage.getText().toString();
                //create an intent
                Intent intentSenMessage = new Intent(SendMessageActivity.this, ReceiveMessage.class);
                //where you are coming and from where you are going

                intentSenMessage.putExtra(EXTRA_SENT_MESSAGE, message);
                //package that text into the intent

                //start the activity
                startActivity(intentSenMessage);


            }
        });
    }

    private void wireWidgets() {
        buttonSendMessage = findViewById(R.id.button_sendmessage_msg);
        editTextMessage = findViewById(R.id.edittext_sendmessage_displaymsg);
    }



}
