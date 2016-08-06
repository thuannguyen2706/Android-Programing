package com.study.thuan.manyactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {
    private TextView txtview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_second);
        txtview = (TextView)findViewById(R.id.textView);
        Bundle extra = getIntent().getExtras();
        if(extra != null)
        {
            String text = extra.getString("Main Activity 1");
            txtview.setText(text);
        }
    }
}
