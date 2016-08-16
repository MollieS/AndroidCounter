package com.example.molliestephenson.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mUpButton;
    private Button mDownButton;
    private TextView mText;
    private int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setLayoutElements();
        setUpButton();
        setDownButton();
    }

    private void setLayoutElements() {
        mUpButton = (Button) findViewById(R.id.up);
        mDownButton = (Button) findViewById(R.id.down);
        mText = (TextView) findViewById(R.id.textView);
    }

    private void setUpButton() {
        mUpButton.setOnClickListener(new increaseNumber());
    }

    private void setDownButton() {
        mDownButton.setOnClickListener(new decreaseNumber());
    }

    private class increaseNumber implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, R.string.up_toast, Toast.LENGTH_SHORT).show();
            number += 1;
            mText.setText(String.valueOf(number));
        }
    }

    private class decreaseNumber implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, R.string.down_toast, Toast.LENGTH_SHORT).show();
            number -= 1;
            mText.setText(String.valueOf(number));
        }
    }
}
