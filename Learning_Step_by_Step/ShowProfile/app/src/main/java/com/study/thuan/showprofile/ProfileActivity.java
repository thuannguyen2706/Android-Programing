package com.study.thuan.showprofile;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PrivateKey;

import static com.study.thuan.showprofile.R.drawable.android;

public class ProfileActivity extends AppCompatActivity {
    ImageView imgDetail;
    TextView txtContent;
    private Bundle extras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imgDetail = (ImageView)findViewById(R.id.imgdetail);
        txtContent = (TextView)findViewById(R.id.txtdetail);


        extras = getIntent().getExtras();
        String name = extras.getString("name");

        ShowDetail(name);

    }

    public void ShowDetail(String _name)
    {
        Toast.makeText(this,_name,Toast.LENGTH_SHORT).show();
        if(_name.equals("Android"))
        {
            imgDetail.setImageResource(R.drawable.android);
            txtContent.setText(extras.getString("android"));
        }

        else if(_name.equals("IOS"))
        {
            imgDetail.setImageResource(R.drawable.ios);
            txtContent.setText(extras.getString("ios"));
        }
    }
}
