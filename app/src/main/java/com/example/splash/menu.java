package com.example.splash;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    private int[] itemNames = {R.string.menu_item_settings, R.string.menu_item_play, R.string.menu_item_scores, R.string.menu_item_help};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return itemNames.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(menu.this).inflate(R.layout.list_item, parent, false);
            }

            TextView textView = convertView.findViewById(R.id.item_text);

            textView.setText(itemNames[position]);

            return convertView;
        }

    }

}