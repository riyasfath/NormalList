package com.example.normallistd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);
        List<String> list=new ArrayList<>();
        list.add("Sahrudaya");
        list.add("Sahrudaya");
        list.add("Sahrudaya");
        list.add("Sahrudaya");
        list.add("Sahrudaya");

        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    startActivity(new Intent(MainActivity.this,sahrudaya.class));

                }
                else if(i==1){

                }else {

                }
            }
        });



    }
}