package com.arcaneconstruct.pocketcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    private static final String TAG = "CalculatorActivity";
    private String operand1 = "";
    private String operand2 = "";
    private String operatie = "";
    private int status = STATUS_NO_OP;
    private static final int STATUS_NO_OP = 0;
    private static final int STATUS_OP1 = 1;
    private static final int STATUS_OP2 = 2;
    private static final int STATUS_OP = 3;
    private static final int STATUS_OP1_RES = 4;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tv = (TextView) findViewById(R.id.tv_view);
    }

    public void onPress0(View v) {
        Log.d(TAG, "0");
    }

    public void onPress1(View v) {
        Log.d(TAG, "1");
    }

    public void onPress2(View v) {
        Log.d(TAG, "2");
    }

    public void onPress3(View v) {
        Log.d(TAG, "3");
    }

    public void onPress4(View v) {
        Log.d(TAG, "4");
    }

    public void onPress5(View v) {
        Log.d(TAG, "5");
    }

    public void onPress6(View v) {
        Log.d(TAG, "6");
    }

    public void onPress7(View v) {
        Log.d(TAG, "7");
    }

    public void onPress8(View v) {
        Log.d(TAG, "8");
    }

    public void onPress9(View v) {
        Log.d(TAG, "9");
    }

    public void onPressImp(View v) {
        Log.d(TAG, "0");
    }

    public void onPressInm(View v) {
        Log.d(TAG, "0");
    }

    public void onPressMin(View v) {
        Log.d(TAG, "0");
    }

    public void onPressPlus(View v) {
        Log.d(TAG, "0");
    }

    public void onPressEq(View v) {
        Log.d(TAG, "0");
    }

    public void onPressDel(View v) {
        Log.d(TAG, "0");
    }

    public void logAll() {
        Log.d(TAG,"status " +status+ "operand1 ="+operand1+" operand2=" +operand2+"operatie="+operatie);
    }
    private void processNumber(String value) {
        logAll();
        if (status == STATUS_NO_OP) {
            operand1 += value;
            tv.setText(operand1);
            status = STATUS_OP1;
        } else if (status == STATUS_OP1) {
            if (operand1.equals("0")) {
                operand1 = value;
                tv.setText(operand1);
            } else {
                operand1 += value;
                tv.setText(operand1);
            }
        } else if (status == STATUS_OP2 || status == STATUS_OP) {
            if (operand2.equals("0")) {
                operand2 = value;
                tv.setText(operand2);
            } else {
                operand2 += value;
                tv.setText(operand2);
                if (status == STATUS_OP) status = STATUS_OP2;
            }
        } else if (status == STATUS_OP1_RES)
            operand1 = value;
        tv.setText(operand1);
        status = STATUS_OP1;
        logAll();
    }

}

