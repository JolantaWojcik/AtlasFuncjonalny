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


public class Mozgowie extends ActionBarActivity {

    ListView listViewMozgowie;
    String[] arrayMozgowie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mozgowie);

        arrayMozgowie = getResources().getStringArray(R.array.elementyMozgowia);
        listViewMozgowie = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayMozgowie);
        listViewMozgowie.setAdapter(adapter);
        listViewMozgowie.setOnItemClickListener( new AdapterView.OnItemClickListener() {
                                                     public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                         if (arrayMozgowie[position] == arrayMozgowie[0]) {
                                                             Intent intent = new Intent(Mozgowie.this, Rdzen.class);
                                                             startActivity(intent);
                                                         }
                                                         if (arrayMozgowie[position] == arrayMozgowie[1]) {
                                                             Intent intent = new Intent(Mozgowie.this, Tylomozgowie.class);
                                                             startActivity(intent);
                                                         }
                                                         if (arrayMozgowie[position] == arrayMozgowie[2]) {
                                                             Intent intent = new Intent(Mozgowie.this, Srodmozgowie.class);
                                                             startActivity(intent);
                                                         }
                                                         if (arrayMozgowie[position] == arrayMozgowie[3]) {
                                                             Intent intent = new Intent(Mozgowie.this, Miedzymozgowie.class);
                                                             startActivity(intent);
                                                         }
                                                         if (arrayMozgowie[position] == arrayMozgowie[4]) {
                                                             Intent intent = new Intent(Mozgowie.this, Kresomozgowie.class);
                                                             startActivity(intent);
                                                         }
                                                         if (arrayMozgowie[position] == arrayMozgowie[5]) {
                                                             Intent intent = new Intent(Mozgowie.this, Komory.class);
                                                             startActivity(intent);
                                                         }
                                                     }
                                                 }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mozgowie, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_uklad) {
            Intent i = new Intent(this, UkladNerwowy.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.start_page) {
            Intent i = new Intent(this, Main.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
