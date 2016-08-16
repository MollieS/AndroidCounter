package com.example.molliestephenson.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mUpButton;
    private Button mDownButton;
    private TextView mNumberDisplay;
    private int mNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNumberDisplay = (TextView) findViewById(R.id.textView);
        mNumber = 0;
        setUpButton();
        setDownButton();
    }

    private void setDownButton() {
        mDownButton = (Button) findViewById(R.id.down);
        mDownButton.setOnClickListener(new NumberViewChange(new Decreaser()));
    }

    private void setUpButton() {
        mUpButton = (Button) findViewById(R.id.up);
        mUpButton.setOnClickListener(new NumberViewChange(new Increaser()));
    }

    private class NumberViewChange implements View.OnClickListener {

        private NumberChanger numberChanger;

        public NumberViewChange(NumberChanger numberChanger) {
            this.numberChanger = numberChanger;
        }

        @Override
        public void onClick(View view) {
            mNumber = numberChanger.changeNumber(mNumber);
            mNumberDisplay.setText(String.valueOf(mNumber));
        }
    }
}
