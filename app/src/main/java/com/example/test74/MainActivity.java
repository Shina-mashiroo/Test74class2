package com.example.test74;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<String> stringList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv);
        stringList = new ArrayList<>();
        for (int i = 0; i<30 ; i++) {
            stringList.add("item"+i);
        }
        MybaseAdapterArr myBaseAdapterarr = new MybaseAdapterArr();
        listView.setAdapter(myBaseAdapterarr);
    }
    public class  MybaseAdapterArr extends BaseAdapter{
        @Override
        public int getCount() {
            return stringList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView = new TextView(MainActivity.this);
            textView.setText(stringList.get(position));
            return textView;
        }
    }

}
