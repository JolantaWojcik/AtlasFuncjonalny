package pl.jolantawojcik.atlasfunkcjonalny;

import android.graphics.Matrix;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Rdzen extends ActionBarActivity {

    private ImageView img;
    private Matrix matrix = new Matrix();
    private float scale = 1f;
    private ScaleGestureDetector SGD;
    private TextView tv;
    //private TextView scaleGesture;
    //TextView scaleGesture;
    //ScaleGestureDetector scaleGestureDetector;

    TextView scaleGesture;
    ScaleGestureDetector scaleGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdzen);

      //  scaleGesture = (TextView)findViewById(R.id.rdzen);
        tv = (TextView) findViewById(R.id.rdzen);
        img = (ImageView)findViewById(R.id.model_rdzen);
        SGD = new ScaleGestureDetector(this,new ScaleListener());
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        SGD.onTouchEvent(ev);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.
            SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale *= detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5.0f));
            matrix.setScale(scale, scale);

            img.setImageMatrix(matrix);

            float size = tv.getTextSize();
            Log.d("TextSizeStart", String.valueOf(size));

            float factor = detector.getScaleFactor();
            Log.d("Factor", String.valueOf(factor));


            float product = size*factor;
            Log.d("TextSize", String.valueOf(product));
            tv.setTextSize(TypedValue.COMPLEX_UNIT_PX, product);

            size = tv.getTextSize();
            Log.d("TextSizeEnd", String.valueOf(size));

           // tv.setText(String.valueOf(detector.getScaleFactor()));

            return true;
        }


    }
}
