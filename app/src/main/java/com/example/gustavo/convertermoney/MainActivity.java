package com.example.gustavo.convertermoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void doConvert(View view){

        EditText text1 = (EditText)findViewById(R.id.editText);
        Double value= Double.parseDouble(text1.getText().toString());
        value= value*1.32;
        Toast.makeText(MainActivity.this,"£ "+String.format( "%.2f", value ), Toast.LENGTH_SHORT).show();


    }



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
