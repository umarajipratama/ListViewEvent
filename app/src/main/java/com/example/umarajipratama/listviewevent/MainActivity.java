package com.example.umarajipratama.listviewevent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView listView1 = (ListView) findViewById(R.id.listView1);

        product[] items = {
                new product(1, "Mie Ayam", 10.00),
                new product(2, "Burger", 15.99),
                new product(3, "Spageti", 14.90),
                new product(4, "Pizza", 7.99),
                new product(5, "Fried Chiken", 10.00),
                new product(6, "Bakso", 10.00),
                new product(6, "Soto", 10.00),
                new product(7, "Es Teh", 02.00),
                new product(8, "Es Jeruk", 02.00),
                new product(9, "Es Nutrisari", 02.00),
                new product(10, "Wedang Jahe", 02.00),
        };

        ArrayAdapter<product> adapter = new ArrayAdapter<product>(this,
                android.R.layout.simple_list_item_1, items);

        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String item = ((TextView) view).getText().toString();

                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

            }
        });

    }
}
