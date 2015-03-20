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


public class Tylomozgowie extends ActionBarActivity {

    String[] arrayTylomozgowie;
    ListView listViewTylomozgowie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tylomozgowie);

        arrayTylomozgowie = getResources().getStringArray(R.array.elementyTyłomózgowia);
        listViewTylomozgowie = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayTylomozgowie);
        listViewTylomozgowie.setAdapter(adapter);
        listViewTylomozgowie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (arrayTylomozgowie[position] == arrayTylomozgowie[0]) {
                    Intent intent = new Intent(Tylomozgowie.this, Neurony.class);
                    startActivity(intent);
                }
                if (arrayTylomozgowie[position] == arrayTylomozgowie[1]) {
                    Intent intent = new Intent(Tylomozgowie.this, Neurony.class);
                    startActivity(intent);
                }

            }
    });
}
}
