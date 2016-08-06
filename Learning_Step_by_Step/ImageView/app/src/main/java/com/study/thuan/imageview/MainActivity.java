package com.study.thuan.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private TextView txtcaption;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img  = (ImageView)findViewById(R.id.imageView);
        txtcaption = (TextView)findViewById(R.id.textView);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtcaption.setText("Android 6 Marsh mallow");
                Log.d(TAG,"Hello From Here");
            }
        });
    }
}
