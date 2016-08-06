package com.study.thuan.showmethebio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgAndroid;
    private  ImageView imgIos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgAndroid = (ImageView)findViewById(R.id.imgandroid);
        imgIos = (ImageView)findViewById(R.id.imgios);

     //   imgAndroid.setOnClickListener(this);
     //   imgIos.setOnClickListener(this);

    }
/*
    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.imgandroid:
                Intent AndroidIntent = new Intent(MainActivity.this, DetailActivity.class);
                AndroidIntent.putExtra("android","Android is OS of Google");
                startActivity(AndroidIntent);
                break;
            case R.id.imgios:
                Intent IosIntent = new Intent(MainActivity.this, DetailActivity.class);
                IosIntent.putExtra("ios","IOS is OS of Apple");
                startActivity(IosIntent);
                break;
        }
    }*/
}
