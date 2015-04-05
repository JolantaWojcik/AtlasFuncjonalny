package pl.jolantawojcik.atlasfunkcjonalny;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;


public class Synapsy extends ActionBarActivity {

    VideoView videoView;
    GifView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.synapsy);
       // videoView = (VideoView)findViewById(R.id.videoView);
        //videoView.setVideoPath("/raw/neural_signali.gif");
        //videoView.start();

        gifView = (GifView) findViewById(R.id.gif_view);
        //textViewInfo = (TextView)findViewById(R.id.textinfo);

    }

}
