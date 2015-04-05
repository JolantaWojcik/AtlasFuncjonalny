package pl.jolantawojcik.atlasfunkcjonalny;

import android.content.Intent;
import android.graphics.Matrix;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;


public class Main extends ActionBarActivity  implements View.OnClickListener {

    private ImageView model_tylomozgowie, model_miedzymozgowie, model_kresomozgowie, model_rdzen, model_srodmozgowie, model_komory;
    private ScaleGestureDetector sgd;
    private Matrix matrix = new Matrix();

    GifView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model_rdzen = (ImageView) findViewById(R.id.model_rdzen);
        model_tylomozgowie = (ImageView) findViewById(R.id.model_tylomozgowie);
        model_srodmozgowie = (ImageView) findViewById(R.id.model_srodmozgowie);
        model_miedzymozgowie = (ImageView) findViewById(R.id.model_miedzymozgowie);
        model_kresomozgowie = (ImageView) findViewById(R.id.model_kresomozgowie);
        model_komory = (ImageView) findViewById(R.id.model_komory_mozgowe);

        sgd = new ScaleGestureDetector(this, new ScaleListener());

        model_rdzen.setOnClickListener(this);
        model_tylomozgowie.setOnClickListener(this);
        model_srodmozgowie.setOnClickListener(this);
        model_miedzymozgowie.setOnClickListener(this);
        model_kresomozgowie.setOnClickListener(this);
        model_komory.setOnClickListener(this);
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

    public boolean onTouchEvent(MotionEvent me){
        sgd.onTouchEvent(me);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{

        public boolean onScale(ScaleGestureDetector detecor){
            float scaleFactor = detecor.getScaleFactor();
            scaleFactor = Math.max(0.1f, Math.min(scaleFactor, 0.5f));

            matrix.setScale(scaleFactor, scaleFactor);
            model_tylomozgowie.setImageMatrix(matrix);
            return true;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        if (id == R.id.action_mozgowie) {
            Intent i = new Intent(this, Mozgowie.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
