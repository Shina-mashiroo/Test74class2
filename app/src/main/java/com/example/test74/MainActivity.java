package com.example.test74;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        listView = findViewById(R.id.lv);
//        List<String> stringList = new ArrayList<>();
//        for (int i = 0 ; i < 30 ; i++) {
//            stringList.add("item"+i);
//        }
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this,R.layout.item,stringList);
//        listView.setAdapter(arrayAdapter);
//        listView.setSelection(10);
//        ImageView imageView = new ImageView(this);
//        imageView.setImageResource(R.drawable.ic_launcher_background);
//        listView.addHeaderView(imageView);
//        listView.addFooterView(imageView);
        listView=findViewById(R.id.lv);
        List<Map<String,Object>> mapList = new ArrayList<>();
        int[] images=new int[]{R.drawable.classshop,R.drawable.buyshop,R.drawable.seeshop,R.drawable.mineshop,R.drawable.seeshop};
        String []names = new String[]{"首页","分类","购物","逛逛","购物"};
        for (int i = 0 ; i<names.length ; i++) {
            Map<String,Object> stringObjectMap = new HashMap<>();
            stringObjectMap.put("name",names[i]);
            stringObjectMap.put("image",images[i]);
            mapList.add(stringObjectMap);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(MainActivity.this,
                mapList,
                R.layout.simitem,
                new String[]{"name","image"},
                new int[]{R.id.tv,R.id.iv});

        listView.setAdapter(simpleAdapter);
    }
}
