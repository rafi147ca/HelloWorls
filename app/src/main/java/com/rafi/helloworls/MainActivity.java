package com.rafi.helloworls;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public void buttonValue(View view){
        int result= 2*5;
        Log.i("TAG OPS", ""+result);
        TextView tView= (TextView) findViewById(R.id.textView);
        Log.i("TAG OPS", ""+tView.getText());
        EditText eText= (EditText) findViewById(R.id.editText);
        Log.i("TAG OPS", ""+eText.getText());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persize_main);
    }
    public void calculateAge(View view){
        EditText eText= (EditText) findViewById(R.id.petEditText);
        TextView tView= (TextView) findViewById(R.id.petTextView);
        int currYear= Calendar.getInstance().get(Calendar.YEAR);
        String str= eText.getText().toString();
        if(str.length()==0){
            tView.setText("Please Enter a Valid Age");
        }
        else {
            int petYear = Integer.parseInt(str);
            Log.i("pet age", "" + petYear);
            petYear = currYear - petYear;
            tView.setText("" + petYear);
        }
    }
}
