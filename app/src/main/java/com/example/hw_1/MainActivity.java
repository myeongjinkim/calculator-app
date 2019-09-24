package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView number;
    private TextView progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (TextView) findViewById(R.id.textView1) ;
        progress = (TextView) findViewById(R.id.textView2) ;
    }
    public void pressButton(View view)
    {
        String s = (String) ((Button) view).getText();
        System.out.println("Press : " + s);
        this.number.setText(this.number.getText() + s);
    }
}
