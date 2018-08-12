package com.example.hasee.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
       startActivity(intent);
            }
        });
        Button button2 = (Button)findViewById(R.id.Button2);
        button2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Toast.makeText(FirstActivity.this,"you click the button 2",Toast.LENGTH_LONG).show();
                    }
        }
          );
    }
}
