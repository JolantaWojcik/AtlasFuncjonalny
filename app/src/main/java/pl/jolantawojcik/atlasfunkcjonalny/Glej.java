package pl.jolantawojcik.atlasfunkcjonalny;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class Glej extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        TextView tv = new TextView(this);
        tv.setText("Komórki glejowe to kolejny typ komórek układu nerwowego. Szacuje się, że jest ich w organizmie około 10 razy więcej niż neuronów. Ich nazwa pochodzi od greckiego słowa \"glia\" oznaczającego klej, gdyż w momencie ich odkrycia sądzono, że stanowią one tylko nieaktywną tkankę łączącą ze sobą komórki nerwowe. Stąd wziął się też popularny mit głoszący, że używamy jedynie 10% możliwości naszych mózgów. Dziś wiemy, że nie jest to prawda a komórki glejowe pełnią w ukłądzie nerwowym różnorakie funkcje.\n" +
                "\t* astrocyty - są to komórki glejowe przypominające kształtem gwiazdę. Ich główna funkcja to odżywianie innych komórek.\n" +
                "\t* oligodendrocyty - tworzą osłonkę mielinową na aksonach w Ośrodkowym Układzie Nerwowym [link]\n" +
                "\t* komórki Schwanna - tworzą osłonkę mielinową na aksonach w Obwodowym Układzie Nerwowym [link]\n" +
                "\t* mikroglej - usuwają umierające neurony \n" +
        "W Ośrodkowym Układzie Nerwowym [link], komórki glejowe tworzą skupiska, które nazywamy \"istotą białą\".");
        tv.setWidth(100);
        tv.setHeight(40);
        layout.addView(tv);
        setContentView(layout);
    }



}
