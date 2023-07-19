package com.example.hw3_month3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity<RecyclerVie> extends AppCompatActivity {

    private RecyclerView recycler_view;
    private ArrayList<String> shopList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                recycler_view = findViewById(R.id.rv_food);
                loadData();
                ShopAdapter adapter = new ShopAdapter(shopList);
                recycler_view.setAdapter(adapter);
            }

            private void loadData() {
                shopList.add("Морковь");
                shopList.add("Хлеб");
                shopList.add("Морковь");
                shopList.add("Мясо");
                shopList.add("Овощи мощные");
                shopList.add("Шоколад просроченный");
                shopList.add("белый сникерс");
                shopList.add("шаурма от качка");
                shopList.add("не томатный кепчук");
                shopList.add("киндер без сюрприза");
                shopList.add("бананы");
                shopList.add("людей");
            }
    }
