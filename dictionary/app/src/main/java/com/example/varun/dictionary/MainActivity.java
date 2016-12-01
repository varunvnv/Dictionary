package com.example.varun.dictionary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button b;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);
        tv=(TextView) findViewById(R.id.textView);
    }

    public void click(View view)
    {
        int found=1;
     String word=et.getText().toString();

        Scanner scan=new Scanner(getResources().openRawResource(R.raw.grewords));
        while (scan.hasNextLine())
        {
            String line=scan.nextLine();
            String[] l=line.split("\t");
            System.out.println(l[0]+"\t"+l[1]);
            if(l[0].equals(word))
            {
                tv.setText(l[1]);
                found=2;
            }
        }
if (found==1)
    tv.setText("Word Not Found");

    }
}
