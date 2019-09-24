package com.example.hw_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = (TextView) findViewById(R.id.textView1) ;
        textView1.setText("Text1 is changed.") ;
        TextView textView2 = (TextView) findViewById(R.id.textView2) ;
        textView2.setText("Text2 is changed.") ;

    }
    public void pressButton(View view)
    {
        System.out.println("Press");
    }
}
