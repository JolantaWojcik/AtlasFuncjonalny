package pl.jolantawojcik.atlasfunkcjonalny;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Synapsy extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        TextView tv = new TextView(this);
        tv.setText("Synapsą nazywamy połączenie, zazwyczaj między dendrytem jednej komórki nerwowej a aksonem drugiej. W jej obrębie następuje przekazanie impulsu. W układzie nerwowym występują dwa rodzaje synaps:\n" +
                "\t* synapsy elektryczne - w ich obrębie, bezpośrednio i szybko, transportowane są między komórkami jony. \n" +
                "\t* synapsy chemiczne - w nich przewodzenie odbywa się wolniej i za pośrednictwem specjalnych związków chemicznych, zwanych neuroprzekaźnikami. Powszechnie znane neuroprzekaźniki to np. serotonina, dopamina, adrenalina.");
        tv.setWidth(100);
        tv.setHeight(40);
        layout.addView(tv);
        setContentView(layout);
    }



}
