package com.example.edittext_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button plus, minos, mult, dev, aC, eq, credits;
    EditText eT;
    Toast t;

    double num = 0;
    double result = 0;
    char action = ' ';
    String strNum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = findViewById(R.id.eT);

        plus = findViewById(R.id.plus);
        minos = findViewById(R.id.minos);
        mult = findViewById(R.id.mult);
        dev = findViewById(R.id.dev);
        aC = findViewById(R.id.aC);
        eq = findViewById(R.id.eq);
        credits = findViewById(R.id.credits);

    }

    public void plusClick(View view) {
        strNum = eT.getText().toString();
        if(!strNum.isEmpty())
        {
            num = Double.parseDouble(strNum);
            eT.getText().clear();

            if(action != ' ')
            {
                result = cal(num, result, action);
            }
            else
            {
                result = num;
            }
            action = '+';
        }

    }

    public void minosClick(View view) {
        strNum = eT.getText().toString();
        if(!strNum.isEmpty())
        {
            num = Double.parseDouble(strNum);
            eT.getText().clear();

            if(action != ' ')
            {
                result = cal(num, result, action);
            }
            else
            {
                result = num;
            }
            action = '-';
        }
    }

    public void multiClick(View view) {
        strNum = eT.getText().toString();
        if(!strNum.isEmpty())
        {
            num = Double.parseDouble(strNum);
            eT.getText().clear();

            if(action != ' ')
            {
                result = cal(num, result, action);
            }
            else
            {
                result = num;
            }
            action = '*';
        }
    }

    public void devClick(View view) {
        strNum = eT.getText().toString();
        if(!strNum.isEmpty())
        {
            num = Double.parseDouble(strNum);
            eT.getText().clear();

            if(action != ' ')
            {
                result = cal(num, result, action);
            }
            else
            {
                result = num;
            }
            action = '/';
        }
    }

    public void acClick(View view) {
        eT.getText().clear();
        result = 0;
        action = ' ';
    }

    public void eqClick(View view) {
        // get the number from the eT and clear it
        strNum = eT.getText().toString();
        if(strNum != "")
        {
            num = Double.parseDouble(strNum);
            eT.getText().clear();

            //cal the result
            if(action != ' ')
            {
                result = cal(num, result, action);
            }
            else
            {
                result = num;
            }

            // show the result on the eT
            String st = Double.toString(result);
            eT.setText(st);

            action = ' ';
        }

    }

    public void creditsClick(View view) {
        Intent si = new Intent(this,CreditsActivity.class);
        si.putExtra("result", result);
        startActivity(si);
    }


    public double cal(double newNum,double oldNum, char action) {
        if (action == '+') {
            return oldNum + newNum;
        }
        else if(action == '-')
        {
            return oldNum - newNum;
        }
        else if(action == '*')
        {
            return oldNum * newNum;
        }
        else
        {
            return oldNum / newNum;
        }
    }

}

