package com.example.hsear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivivty extends AppCompatActivity {

    Button button1;
    Button button2;
    private int what_to_create = 0;
    private int caught_value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivivty.this,
                        StartActivity.class);
                startActivityForResult(intent, caught_value);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".MainActivity");
                String my_value = Integer.toString(what_to_create);
                intent.putExtra("flag", my_value);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == caught_value) {
            if (resultCode == RESULT_OK) {
                String myflag = data.getStringExtra(StartActivity.OBJECT);
                if (myflag.equals("1")) {
                    what_to_create = 1;
                } else if (myflag.equals("2")) {
                    what_to_create = 2;
                }
            }else {
                finish();
            }
        }
    }
}
