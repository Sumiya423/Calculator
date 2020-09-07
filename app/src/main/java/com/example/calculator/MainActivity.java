package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
            buttonMul, buttonDot, buttonC, buttonEqual;

    EditText editText;

    float mValueOne, mValueTwo;
    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0Id);
        button1 = (Button) findViewById(R.id.button1Id);
        button2 = (Button) findViewById(R.id.button2Id);
        button3 = (Button) findViewById(R.id.button3Id);
        button4 = (Button) findViewById(R.id.button4Id);
        button5 = (Button) findViewById(R.id.button5Id);
        button6 = (Button) findViewById(R.id.button6Id);
        button7 = (Button) findViewById(R.id.button7Id);
        button8 = (Button) findViewById(R.id.button8Id);
        button9 = (Button) findViewById(R.id.button9Id);
        buttonAdd = (Button) findViewById(R.id.buttonAddId);
        buttonDot = (Button) findViewById(R.id.buttonDotId);
        buttonSub = (Button) findViewById(R.id.buttonSubId);
        buttonMul = (Button) findViewById(R.id.buttonMulId);
        buttonDiv = (Button) findViewById(R.id.buttonDivId);
        buttonC = (Button) findViewById(R.id.buttonCId);
        buttonEqual = (Button) findViewById(R.id.buttonEqualId);

        editText = (EditText) findViewById(R.id.editTextId);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonSub.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if (v.getId() == R.id.button0Id) {
            editText.setText(editText.getText() + "0");

        } else if (v.getId() == R.id.button1Id) {
            editText.setText(editText.getText() + "1");

        } else if (v.getId() == R.id.button2Id) {
            editText.setText(editText.getText() + "2");

        } else if (v.getId() == R.id.button3Id) {
            editText.setText(editText.getText() + "3");

        } else if (v.getId() == R.id.button4Id) {
            editText.setText(editText.getText() + "4");

        } else if (v.getId() == R.id.button5Id) {
            editText.setText(editText.getText() + "5");

        } else if (v.getId() == R.id.button6Id) {
            editText.setText(editText.getText() + "6");

        } else if (v.getId() == R.id.button7Id) {
            editText.setText(editText.getText() + "7");

        } else if (v.getId() == R.id.button8Id) {
            editText.setText(editText.getText() + "8");

        } else if (v.getId() == R.id.button9Id) {
            editText.setText(editText.getText() + "9");

        }
        else if (v.getId() == R.id.buttonDotId) {
            editText.setText(editText.getText() + ".");

        }
        else if (v.getId() == R.id.buttonAddId) {
            if (editText == null){
                editText.setText("");
            }else {
                mValueOne = Float.parseFloat(editText.getText() + "");
                mAddition = true;
                editText.setText(null);
            }
        }
        else if (v.getId() == R.id.buttonSubId) {
            mValueOne = Float.parseFloat(editText.getText() + "");
            mSubtract = true;
            editText.setText(null);
        }
        else if (v.getId() == R.id.buttonMulId) {
            mValueOne = Float.parseFloat(editText.getText() + "");
            mMultiplication = true;
            editText.setText(null);

        }
        else if (v.getId() == R.id.buttonDivId) {
            mValueOne = Float.parseFloat(editText.getText() + "");
            mDivision = true;
            editText.setText(null);

        }
        else if (v.getId() == R.id.buttonEqualId) {

            mValueTwo = Float.parseFloat(editText.getText() + "");

            if (mAddition == true){

                editText.setText(mValueOne + mValueTwo +"");
                mAddition=false;
            }


            if (mSubtract == true){
                editText.setText(mValueOne - mValueTwo+"");
                mSubtract=false;
            }

            if (mMultiplication == true){
                editText.setText(mValueOne * mValueTwo+"");
                mMultiplication=false;
            }

            if (mDivision == true){
                editText.setText(mValueOne / mValueTwo+"");
                mDivision=false;
            }

        }
        else if (v.getId() == R.id.buttonCId) {
            editText.setText("");

        }

    }
}