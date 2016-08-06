package com.study.thuan.showprofile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imgAndroid;
    private ImageView imgIos;
    String AndroidInfo = "Android là hệ điều hành trên điện thoại di động " +
            "(và hiện nay là cả trên một số đầu phát HD, HD Player, TV)" +
            " phát triển bởi Google và dựa trên nền tảng Linux." +
            " Trước đây, Android được phát triển bởi công ty liên hợp Android " +
            "( sau đó được Google mua lại vào năm 2005).";
    String IosInfo = "iOS là hệ điều hành trên các thiết bị di động của Apple." +
            " Ban đầu hệ điều hành này chỉ được phát triển để chạy trên iPhone (gọi là iPhone OS), " +
            "nhưng sau đó nó đã được mở rộng để chạy trên các thiết bị của Apple như iPod touch, " +
            "iPad và Apple TV.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgAndroid = (ImageView)findViewById(R.id.imgA);
        imgIos = (ImageView)findViewById(R.id.imgI);

        imgAndroid.setOnClickListener(this);
        imgIos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent ProfileIntent = new Intent(MainActivity.this,ProfileActivity.class);
        switch (v.getId())
        {
            case R.id.imgA:
                //Toast.makeText(this,"This is Android OS",Toast.LENGTH_SHORT).show();
                ProfileIntent.putExtra("android",AndroidInfo);
                ProfileIntent.putExtra("name", "Android");
                startActivity(ProfileIntent);
                break;
            case R.id.imgI:
                //Toast.makeText(this,"This is IOS",Toast.LENGTH_SHORT).show();
                ProfileIntent.putExtra("ios",IosInfo);
                ProfileIntent.putExtra("name", "IOS");
                startActivity(ProfileIntent);
                break;
        }


    }
}
