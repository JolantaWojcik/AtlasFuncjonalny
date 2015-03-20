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


public class Kresomozgowie extends ActionBarActivity {

    String[] arrayKresomozgowie;
    ListView  listViewKresomozgowie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kresomozgowie);

        arrayKresomozgowie = getResources().getStringArray(R.array.elementyKresomózgowia);
        listViewKresomozgowie = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,  arrayKresomozgowie);
        listViewKresomozgowie.setAdapter(adapter);
        listViewKresomozgowie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if ( arrayKresomozgowie[position] ==  arrayKresomozgowie[0]) {
                    Intent intent = new Intent(Kresomozgowie.this, Neurony.class);
                    startActivity(intent);
                }
                if (arrayKresomozgowie[position] ==  arrayKresomozgowie[1]) {
                    Intent intent = new Intent(Kresomozgowie.this, Neurony.class);
                    startActivity(intent);
                }
                if (arrayKresomozgowie[position] ==  arrayKresomozgowie[2]) {
                    Intent intent = new Intent(Kresomozgowie.this, Neurony.class);
                    startActivity(intent);
                }
                if (arrayKresomozgowie[position] ==  arrayKresomozgowie[3]) {
                    Intent intent = new Intent(Kresomozgowie.this, Neurony.class);
                    startActivity(intent);
                }
                if (arrayKresomozgowie[position] ==  arrayKresomozgowie[4]) {
                    Intent intent = new Intent(Kresomozgowie.this, Neurony.class);
                    startActivity(intent);
                }
            }
        });
    }



}
