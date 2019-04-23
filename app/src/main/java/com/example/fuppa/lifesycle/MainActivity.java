package com.example.fuppa.lifesycle;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    public final static String TAG = "LCTest";
    private TextView returntext;
    private TextInputEditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");


        input = findViewById(R.id.input);
        Button get_button = (Button) findViewById(R.id.get);
        Button post_button = (Button) findViewById(R.id.post);

        get_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String post = editTxt;
                Toast.makeText(MainActivity.this, R.string.main_act,
                        Toast.LENGTH_LONG).show();
            }
        });

        post_button.setOnClickListener(new View.OnClickListener()) {
            @Override




        }

        returntext = findViewById(R.id.ReturntextView);
    }



}