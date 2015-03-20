package pl.jolantawojcik.atlasfunkcjonalny;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.AbsoluteLayout.LayoutParams;


public class Neurony extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        TextView tv = new TextView(this);
        tv.setText("Układ nerwowy tworzą wyspecjalizowane komórki nerwowe zwane neuronami. Ich głównym zadaniem jest przewodzenie impulsów elektrycznych. Neuron możemy podzielić na trzy podstawowe części:\n" +
                "\t* perikarion, zwany inaczej somą lub ciałem komórki - jest to centralna część komórki, w której znajduje się jądro komórkowe\n" +
                "\t* dendryty - silnie rozgałęzione wypustki, przez które sygnał nerwowy trafia do komórki\n" +
                "\t* akson - bardzo długa, zazwyczaj pojedyncza wypustka, przez którą sygnał nerwowy wychodzi z komórki. \n" +
                "Sygnał elektryczny pokonuje więc w komórce następującą trasę: dendryt -> soma -> akson. Następnie, za pośrednictwem synapsy elektrycznej, przechodzi na dendryt kolejnej komórki i cały schemat powtarza się. \n" +
                "Akson jest dodatkowo pokryty tzw. otoczką mielinową. Mielina to specjalna substancja, która działa jak izolacja. Dzięki niej sygnał elektryczny może być transportowany szybciej, " +
                "gdyż nie musi pokonywać całej długiej drogi przez akson - pomija on miejsca, w których znajdują się kłębki mieliny, i przeskakuje tylko od jednej do drugiej przerwy między nimi. Kłębki te noszą nazwę przewężeń Ranviera. \n"+
                "W Ośrodkowym Układzie Nerwowym [link], ciała neuronów tworzą skupiska, które nazywamy istotą szarą");
        tv.setWidth(50);
        tv.setHeight(40);
        layout.addView(tv);
        setContentView(layout);
    }
}
