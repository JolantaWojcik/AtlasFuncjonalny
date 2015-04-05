package pl.jolantawojcik.atlasfunkcjonalny;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Matrix;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class Tylomozgowie extends ActionBarActivity implements View.OnTouchListener{

    String[] arrayTylomozgowie;
    ListView listViewTylomozgowie;
    ImageView tylomozgowie;
    private ScaleGestureDetector sgd;
    private Matrix matrix;

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
                    Intent intent = new Intent(Tylomozgowie.this, Most.class);
                    startActivity(intent);
                }
                if (arrayTylomozgowie[position] == arrayTylomozgowie[1]) {
                    Intent intent = new Intent(Tylomozgowie.this, Mozdzek.class);
                    startActivity(intent);
                }

            }
        });

        tylomozgowie = (ImageView) findViewById(R.id.tylomozgowie);
        matrix = new Matrix();
        sgd = new ScaleGestureDetector(this, new ScaleListener());
       // tylomozgowie.setOnClickListener(this);
    }
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v.getId() == R.id.tylomozgowie) {
            Intent i = new Intent(this, Tylomozgowie.class);
            startActivity(i);
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        sgd.onTouchEvent(event);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent me){
        sgd.onTouchEvent(me);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {

        public boolean onScale(ScaleGestureDetector detecor) {
            float scaleFactor = detecor.getScaleFactor();
            scaleFactor = Math.max(0.1f, Math.min(scaleFactor, 0.5f));

            matrix.setScale(scaleFactor, scaleFactor);
            tylomozgowie.setImageMatrix(matrix);
            return true;
        }
    }

}

