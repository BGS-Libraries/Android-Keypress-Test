package com.brightcove.keypresstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView centerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        centerText = (TextView) findViewById(R.id.center_text);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Show the keycode on the screen
        centerText.setText("KeyCode: " + keyCode);

        return super.onKeyDown(keyCode, event);
    }
}
