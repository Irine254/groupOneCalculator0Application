package com.example.grouponecalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private Button  division;
    private Button  multiplication;
    private Button  delete;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button minus;
    private Button four;
    private Button five;
    private Button six;
    private Button plus;
    private Button one;
    private Button two;
    private Button three;
    private Button zero;
    private Button decimal;
    private Button answer;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          Button division = (Button)findViewById(R.id.bt_division_id);
          division.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  TextView  myTextView = (TextView)findViewById(R.id.tv_screen_id);

              }
          });








    }
}
