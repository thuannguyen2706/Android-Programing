package com.study.thuan.practice2converttemprature;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


/*
C = (F - 32)*5/9
F = C*9/5 - 32
 */
public class MainActivity extends AppCompatActivity {
    private Button btnC;
    private Button btnF;
    private EditText edtemp;
    private TextView txtresult;
    DecimalFormat dc = new DecimalFormat("0.0");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnC = (Button)findViewById(R.id.btnc);
        btnF = (Button)findViewById(R.id.btnf);
        edtemp = (EditText)findViewById(R.id.txttemp);
        txtresult = (TextView)findViewById(R.id.txtresult);


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputTemp = edtemp.getText().toString();
                if(inputTemp.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Bạn Chưa Nhập Giá Trị Cần Chuyển Đổi !",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double Tempval = Double.parseDouble(inputTemp);
                    double convertVal =  ConvertToC(Tempval);
                    String Result = String.valueOf(dc.format(convertVal));
                    txtresult.setText(Result + " C");
                }
            }
        });

        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputTemp = edtemp.getText().toString();
                if(inputTemp.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Bạn Chưa Nhập Giá Trị Cần Chuyển Đổi !",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double Tempval = Double.parseDouble(inputTemp);
                    double convertVal =  ConvertToF(Tempval);
                    String Result = String.valueOf(dc.format(convertVal));
                    txtresult.setText(Result + " F");
                }
            }
        });
    }

    public double ConvertToC(double _tempF)
    {
        double resultC;
        resultC = (_tempF - 32)*5/9;
        return resultC;
    }

    public double ConvertToF(double _tempC)
    {
        double resultF;
        resultF = _tempC*5/9 -32;
        return resultF;
    }
}
