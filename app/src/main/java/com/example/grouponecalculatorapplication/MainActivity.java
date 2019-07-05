package com.example.grouponecalculatorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText myEditText;
    private TextView myTextView;
    private Button  division;
    private Button  multiplication;
    private Button delete;
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
    private Button decimal;
    private Button zero;
    private Button equal;

    float Value1, Value2;
    boolean mDivision, mMultiplication, mMinus, mPlus;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button seven = (Button)findViewById(R.id.bt_seven_id);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+ "7");


            }
        });


        Button eight = (Button)findViewById(R.id.bt_eight_id);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+ "8");

            }
        });

        Button nine = (Button)findViewById(R.id.bt_nine_id);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"9");

            }
        });


        Button four  = (Button)findViewById(R.id.bt_four_id);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"4");



            }
        });

        Button five = (Button)findViewById(R.id.bt_five_id);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"5");

            }
        });


        Button six = (Button)findViewById(R.id.bt_six_id);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"6");
            }
        });

        Button one = (Button)findViewById(R.id.bt_one_id);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"1");
            }
        });

        Button two = (Button)findViewById(R.id.bt_two_id);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"2");
            }
        });

        Button three = (Button)findViewById(R.id.bt_three_id);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"3");


            }
        });

        Button zero = (Button)findViewById(R.id.bt_zero_id);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"0");
            }
        });

        Button decimal = (Button)findViewById(R.id.bt_decimal_id);
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+".");

            }
        });

         Button  division = (Button)findViewById(R.id.bt_division_id);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"/");


            }
        });

        Button multiplication = (Button)findViewById(R.id.bt_multiplication_id);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"*");
            }
        });

        Button  minus = (Button)findViewById(R.id.bt_minus_id);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"-");
            }
        });

        Button plus = (Button)findViewById(R.id.bt_plus_id);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText(myEditText.getText()+"+");
            }
        });

         Button delete = (Button)findViewById(R.id.bt_delete_id);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                myEditText.setText("");
                myTextView.setText("");
            }
        });

        Button equal = (Button)findViewById(R.id.bt_equal_id);



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText  myEditText = (EditText)findViewById(R.id.et_screen1_id);
                TextView  myTextView = (TextView)findViewById(R.id.tv_screen2_id);

                Value2 = Float.parseFloat(myTextView.getText()+"");

                if(mPlus == true){

                    myTextView.setText(Value1 + Value2 +"");
                    mPlus=false;
                }



                if (mMinus==true);{

                    myTextView.setText(Value1-Value2 +"");
                    mMinus=false;
                }



                if (mMultiplication==true);{
                    myTextView.setText(Value1*Value2 +"");
                    mMultiplication=false;
                }


                if (mDivision==true);{
                    myTextView.setText(Value1/Value2 +"");
                    mDivision=false;
                }


            }
        });



















}










}
