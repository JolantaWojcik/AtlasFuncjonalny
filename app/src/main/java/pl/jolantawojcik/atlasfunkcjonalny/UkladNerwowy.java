package pl.jolantawojcik.atlasfunkcjonalny;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class UkladNerwowy extends ActionBarActivity {

    ListView listView;
    String[] arrayUkladNewrowy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uklad_nerwowy);

        arrayUkladNewrowy = getResources().getStringArray(R.array.elementyUkladuNerwowego);
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, arrayUkladNewrowy);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener( new OnItemClickListener(){
                public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                    if(arrayUkladNewrowy[position]==arrayUkladNewrowy[0]){
                        Intent intent = new Intent(UkladNerwowy.this, Neurony.class);
                        startActivity(intent);
                    }
                    if(arrayUkladNewrowy[position]==arrayUkladNewrowy[1]){
                        Intent intent = new Intent(UkladNerwowy.this, Glej.class);
                        startActivity(intent);
                    }
                    if(arrayUkladNewrowy[position]==arrayUkladNewrowy[2]){
                        Intent intent = new Intent(UkladNerwowy.this, Synapsy.class);
                        startActivity(intent);
                    }
                    if(arrayUkladNewrowy[position]==arrayUkladNewrowy[3]){
                        Intent intent = new Intent(UkladNerwowy.this, PodzialUN.class);
                        startActivity(intent);
                    }
                }
             }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_uklad_nerwowy, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_mozgowie) {
            Intent i = new Intent(this, Mozgowie.class);
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
