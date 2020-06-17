package com.example.hsear;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    private int isOne = 0;
    public final static String OBJECT = "something";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".android.intent.action.MAIN");
                intent.putExtra(OBJECT, "1");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isOne = 2;
                Intent intent = new Intent(".android.intent.action.MAIN");
                intent.putExtra(OBJECT, "2");
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }

}
