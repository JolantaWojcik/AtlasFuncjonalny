package pl.jolantawojcik.atlasfunkcjonalny;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Miedzymozgowie extends ActionBarActivity {

    String[] arrayMiedzymozgowie;
    ListView listViewMiedzymozgowie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miedzymozgowie);

        arrayMiedzymozgowie = getResources().getStringArray(R.array.elementyMiędzymózgowia);
        listViewMiedzymozgowie = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayMiedzymozgowie);
        listViewMiedzymozgowie.setAdapter(adapter);
        listViewMiedzymozgowie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (arrayMiedzymozgowie[position] == arrayMiedzymozgowie[0]) {
                    Intent intent = new Intent(Miedzymozgowie.this, Neurony.class);
                    startActivity(intent);
                }
                if (arrayMiedzymozgowie[position] == arrayMiedzymozgowie[1]) {
                    Intent intent = new Intent(Miedzymozgowie.this, Neurony.class);
                    startActivity(intent);
                }
                if (arrayMiedzymozgowie[position] == arrayMiedzymozgowie[2]) {
                    Intent intent = new Intent(Miedzymozgowie.this, Neurony.class);
                    startActivity(intent);
                }

            }
        });
    }



}
