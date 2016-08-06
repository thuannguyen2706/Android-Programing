package com.study.thuan.showmethebio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            String myData = extras.getString("android");// get string with key
            Toast.makeText(this,myData,Toast.LENGTH_SHORT);
        }
    }
}
