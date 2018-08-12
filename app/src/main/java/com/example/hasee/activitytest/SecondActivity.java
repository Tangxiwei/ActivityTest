package com.example.hasee.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class SecondActivity extends AppCompatActivity {

    private List<Fruit> fruitlist = new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(SecondActivity.this,R.layout.fruit_item,fruitlist);
        ListView listview = (ListView)findViewById(R.id.list_view);
        listview.setAdapter(adapter);
    }
    private void initFruits()
    {
        for (int i=0;i<8;i++)
        {
            Fruit apple = new Fruit("Apple",R.drawable.apple);
            fruitlist.add(apple);
            Fruit banana = new Fruit("Banana",R.drawable.banana);
            fruitlist.add(banana);
            Fruit cherry = new Fruit("Cherrry",R.drawable.cherry);
            fruitlist.add(cherry);

        }
    }
}
