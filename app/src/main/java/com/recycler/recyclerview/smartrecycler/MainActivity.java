package com.recycler.recyclerview.smartrecycler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

        ListItem item1 = new ListItem("Coffee","Beverage");
        listItems.add(item1);
        ListItem item2 = new ListItem("Tea","Beverage");
        listItems.add(item2);
        ListItem item3 = new ListItem("French Fries","Snacks");
        listItems.add(item3);
        ListItem item4 = new ListItem("Lemonade","Fruit Juice");
        listItems.add(item4);
        ListItem item5 = new ListItem("Coca-cola","Soft Drink");
        listItems.add(item5);
        ListItem item6 = new ListItem("Dairy Milk","Chocolate");
        listItems.add(item6);
        ListItem item7 = new ListItem("North Indian Thali","Meal");
        listItems.add(item7);
        ListItem item8 = new ListItem("South Indian Thali","Meal");
        listItems.add(item8);
        ListItem item9 = new ListItem("Nuggets","Snacks");
        listItems.add(item9);
        ListItem item10 = new ListItem("Jim-Jam","Biscuits");
        listItems.add(item10);

        adapter = new MyAdapter(this, listItems);
        recyclerView.setAdapter(adapter);

    }
}
