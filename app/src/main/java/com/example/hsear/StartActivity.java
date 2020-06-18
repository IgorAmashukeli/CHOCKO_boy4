package com.example.hsear;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class StartActivity extends AppCompatActivity {
    Button button3;
    private int isOne = 0;
    public final static String OBJECT = "something";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button3 = (Button) findViewById(R.id.button3);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.chb1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.chb2);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    isOne = 1;
                } else {
                    isOne = 0;
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    isOne = 2;
                } else {
                    isOne = 0;
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".android.intent.action.MAIN");
                String myString = Integer.toString(isOne);
                intent.putExtra(OBJECT, myString);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }

}
