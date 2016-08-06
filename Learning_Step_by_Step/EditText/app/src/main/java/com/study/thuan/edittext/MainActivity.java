package com.study.thuan.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnendter;
    private TextView txtshow;
    private EditText etname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnendter = (Button)findViewById(R.id.btnshow);
        txtshow = (TextView)findViewById(R.id.txtshow);
        etname = (EditText)findViewById(R.id.txtname);

        btnendter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtshow.setText("Your name is " + etname.getText().toString());
            }
        });
    }
}
