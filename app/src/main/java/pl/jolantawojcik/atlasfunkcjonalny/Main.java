package pl.jolantawojcik.atlasfunkcjonalny;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;

public class Main extends ActionBarActivity implements View.OnClickListener, SearchView.OnQueryTextListener,
        SearchView.OnCloseListener {

    private ListView mListView;
    private SearchView searchView;
    private DbAdapter mDbHelper;

    private ImageView model_tylomozgowie, model_miedzymozgowie, model_kresomozgowie, model_rdzen, model_srodmozgowie, model_komory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       searchView = (SearchView) findViewById(R.id.searchView);

        model_rdzen = (ImageView) findViewById(R.id.model_rdzen);
        model_tylomozgowie = (ImageView) findViewById(R.id.model_tylomozgowie);
        model_srodmozgowie = (ImageView) findViewById(R.id.model_srodmozgowie);
        model_miedzymozgowie = (ImageView) findViewById(R.id.model_miedzymozgowie);
        model_kresomozgowie = (ImageView) findViewById(R.id.model_kresomozgowie);
        model_komory = (ImageView) findViewById(R.id.model_komory_mozgowe);

        model_rdzen.setOnClickListener(this);
        model_tylomozgowie.setOnClickListener(this);
        model_srodmozgowie.setOnClickListener(this);
        model_miedzymozgowie.setOnClickListener(this);
        model_kresomozgowie.setOnClickListener(this);
        model_komory.setOnClickListener(this);

        //searchView = (SearchView) findViewById(R.id.search);
        searchView = (SearchView) findViewById(R.id.searchView);
        //searchView.setIconifiedByDefault(false);
        searchView.setOnQueryTextListener(this);
        searchView.setOnCloseListener(this);

        mListView = (ListView) findViewById(R.id.searchList);

        mDbHelper = new DbAdapter(this);
        mDbHelper.open();

        mDbHelper.deleteAllItems();
        mDbHelper.createItem("Układ nerwowy");
        mDbHelper.createItem("Neurony");
        mDbHelper.createItem("Glej");
        mDbHelper.createItem("Synapsy");
        mDbHelper.createItem("Podział układu nerwowego");
        mDbHelper.createItem("Mózgowie człowieka");
        mDbHelper.createItem("Rdzeń przedłużony");
        mDbHelper.createItem("Tyłomózgowie wtórne");
        mDbHelper.createItem("Most");
        mDbHelper.createItem("Móżdżek");
        mDbHelper.createItem("Śródmózgowie");
        mDbHelper.createItem("Międzymózgowie");
        mDbHelper.createItem("Podwzgórze");
        mDbHelper.createItem("Wzgórze");
        mDbHelper.createItem("Przysadka mózgowa");
        mDbHelper.createItem("Kresomózowie");
        mDbHelper.createItem("Kora mózgowa");
        mDbHelper.createItem("Hipokamp");
        mDbHelper.createItem("Wyspa");
        mDbHelper.createItem("Jądra podstawy");
        mDbHelper.createItem("Spoidła");
        mDbHelper.createItem("Komory mózgowe");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mDbHelper  != null) {
            mDbHelper.close();
        }
    }

    public boolean onQueryTextChange(String newText) {
        showResults(newText + "*");
        return false;
    }

    public boolean onQueryTextSubmit(String query) {
        showResults(query + "*");
        return false;
    }

    public boolean onClose() {
        showResults("");
        return false;
    }

    private void showResults(String query) {

        Cursor cursor = mDbHelper.searchItem((query != null ? query.toString() : "@@@@"));

        if (cursor == null) {
            //
        } else {
            // Specify the columns we want to display in the result
            String[] from = new String[] {
                    DbAdapter.KEY_NAME};

            // Specify the Corresponding layout elements where we want the columns to go
            int[] to = new int[] {
                    R.id.sname};

            // Create a simple cursor adapter for the definitions and apply them to the ListView
            SimpleCursorAdapter dbRecord = new SimpleCursorAdapter(this,R.layout.activity_result, cursor, from, to);
            mListView.setAdapter(dbRecord);

            // Define the on-click listener for the list items
            mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    // Get the cursor, positioned to the corresponding row in the result set
                    Cursor cursor = (Cursor) mListView.getItemAtPosition(position);

                    // Get the state's capital from this row in the database.
                    String name = cursor.getString(cursor.getColumnIndexOrThrow("name"));

                    if(name.equals("Układ nerwowy")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, UkladNerwowy.class);
                        startActivity(i);
                    }
                    if(name.equals("Neurony")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Neurony.class);
                        startActivity(i);
                    }
                    if(name.equals("Glej")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Glej.class);
                        startActivity(i);
                    }
                    if(name.equals("Synapsy")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Synapsy.class);
                        startActivity(i);
                    }
                    if(name.equals("Podział układu nerwowego")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, PodzialUN.class);
                        startActivity(i);
                    }
                    if(name.equals("Mózgowie człowieka")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Mozgowie.class);
                        startActivity(i);
                    }
                    if(name.equals("Rdzeń przedłużony")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Rdzen.class);
                        startActivity(i);
                    }
                    if(name.equals("Tyłomózgowie wtórne")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Tylomozgowie.class);
                        startActivity(i);
                    }
                    if(name.equals("Most")) {
                       // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Most.class);
                        startActivity(i);
                    }
                    if(name.equals("Móżdżek")) {
                        // setContentView(R.layout.activity_most);
                        Intent i = new Intent(Main.this, Mozdzek.class);
                        startActivity(i);
                    }
                    if(name.equals("Śródmózgowie")) {
                        Intent i = new Intent(Main.this, Srodmozgowie.class);
                        startActivity(i);
                    }
                    if(name.equals("Międzymózgowie")) {
                        Intent i = new Intent(Main.this, Miedzymozgowie.class);
                        startActivity(i);
                    }
                    if(name.equals("Podwzgórze")) {
                        Intent i = new Intent(Main.this, Podwzgorze.class);
                        startActivity(i);
                    }
                    if(name.equals("Wzgórze")) {
                        Intent i = new Intent(Main.this, Wzgorze.class);
                        startActivity(i);
                    }
                    if(name.equals("Przysadka mózgowa")) {
                        Intent i = new Intent(Main.this, Przysadka.class);
                        startActivity(i);
                    }
                    if(name.equals("Kresomózowie")) {
                        Intent i = new Intent(Main.this, Kresomozgowie.class);
                        startActivity(i);
                    }
                    if(name.equals("Kora mózgowa")) {
                        Intent i = new Intent(Main.this, KoraMozgowa.class);
                        startActivity(i);
                    }
                    if(name.equals("Hipokamp")) {
                        Intent i = new Intent(Main.this, Hipokamp.class);
                        startActivity(i);
                    }
                    if(name.equals("Wyspa")) {
                        Intent i = new Intent(Main.this, Wyspa.class);
                        startActivity(i);
                    }
                    if(name.equals("Jądra podstawy")) {
                        Intent i = new Intent(Main.this, JadraPodstawy.class);
                        startActivity(i);
                    }
                    if(name.equals("Spoidła")) {
                        Intent i = new Intent(Main.this, Spoidla.class);
                        startActivity(i);
                    }
                    if(name.equals("Komory mózgowe")) {
                        Intent i = new Intent(Main.this, Komory.class);
                        startActivity(i);
                    }
                }
            });
        }
    }

    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v.getId() == R.id.model_rdzen) {
            Intent i = new Intent(this, Rdzen.class);
            startActivity(i);
        }
        if (v.getId() == R.id.model_tylomozgowie) {
            Intent i = new Intent(this, Tylomozgowie.class);
            startActivity(i);
        }
        if (v.getId() == R.id.model_srodmozgowie) {
            Intent i = new Intent(this, Srodmozgowie.class);
            startActivity(i);
        }
        if (v.getId() == R.id.model_miedzymozgowie) {
            Intent i = new Intent(this, Miedzymozgowie.class);
            startActivity(i);
        }
        if (v.getId() == R.id.model_kresomozgowie) {
            Intent i = new Intent(this, Kresomozgowie.class);
            startActivity(i);
        }
        if (v.getId() == R.id.model_komory_mozgowe) {
            Intent i = new Intent(this, Komory.class);
            startActivity(i);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_uklad) {
            Intent i = new Intent(this, UkladNerwowy.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.action_mozgowie) {
            Intent i = new Intent(this, Mozgowie.class);
            startActivity(i);
            return true;
        }

        // return super.onOptionsItemSelected(item);
        return false;
    }
}