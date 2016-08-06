package com.study.thuan.manyactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnopen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnopen = (Button)findViewById(R.id.btnopen);
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ActivitySecond.class);
                i.putExtra("Main Activity 1"," This is First Activity");
                startActivity(i);
                //startActivity(new Intent(MainActivity.this,ActivitySecond.class)); //open second activity
            }
        });
    }
}
