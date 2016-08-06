package com.study.thuan.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnrd;
    private TextView txtrd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnrd = (Button)findViewById(R.id.btn1);
        txtrd = (TextView)findViewById(R.id.textView);

        final String[] mountains = {"Everest", "Hymalaya", "Urgan","Anper"};
        btnrd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();
                int rdvalue = rd.nextInt(mountains.length);
                txtrd.setText(mountains[rdvalue]);
            }
        });
    }
}
