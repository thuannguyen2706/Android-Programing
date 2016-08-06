package com.study.thuan.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv1 = (ListView)findViewById(R.id.list1);
        final  String[] value = new String[]{
                "Programing Language",
                "C",
                "C++",
                "C#",
                "Java",
                "Swift",
                "Ruby",
                "Python",
                "PHP"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext()
                        ,android.R.layout.simple_list_item_1,android.R.id.text1,value);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int Lposition = position;
                String clickedValue = lv1.getItemAtPosition(Lposition).toString();
                Toast.makeText(getApplicationContext(),"This is " + clickedValue,Toast.LENGTH_LONG).show();
            }
        });
    }
}
