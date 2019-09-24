package com.example.hw_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

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
    public void pressNumButton(View view)
    {
        String s = (String) ((Button) view).getText();
        if(this.number.getText().equals("0"))
        {
            this.number.setText(s);
        }else {
            this.number.setText(this.number.getText() + s);
        }
    }
    public void pressOperButton(View view)
    {
        String s = (String) ((Button) view).getText();
        this.progress.setText(this.number.getText() +" "+ s);
        this.number.setText("0");
    }
    public void pressPointButton(View view)
    {
        String s = (String) ((Button) view).getText();
        this.number.setText(this.number.getText() + s);
    }
    public void pressSignButton(View view) {
        String s = (String) ((Button) view).getText();
        String num = (String)this.number.getText();
        if(num.charAt(0)=='0'){

        }else if(num.charAt(0)=='-')
        {
            String paste= "";
            for(int i=0 ; i < (num.length())-1 ;i++) {
                paste+=num.charAt(i+1);
            }
            this.number.setText(paste);
        }else{
            this.number.setText("-"+num);
        }
    }
    public void pressRemoveButton(View view) {
        String s = (String) ((Button) view).getText();
        if(s.equals("C")) {
            this.number.setText("0");
            this.progress.setText("");
        }else if(s.equals("CE")) {
            this.number.setText("0");
        }else if(s.equals("지우기")){
            String paste = "";
            String num = (String) this.number.getText();
            for (int i = 0; i < (num.length()) - 1; i++) {
                paste += num.charAt(i);
            }
            this.number.setText(paste);
        }
    }
    //pressRemoveButton



}
