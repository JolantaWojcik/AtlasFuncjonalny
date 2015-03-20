package pl.jolantawojcik.atlasfunkcjonalny;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;


public class PodzialUN extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        //layout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        TextView tv = new TextView(this);
        tv.setText("Układ nerwowy człowieka i innych ssaków możemy podzielić na następujące części:\n" +
                "\t\n" +
                "Ośrodkowy Układ Nerwowy (OUN)\n" +
                "\ta) rdzeń kręgowy - znajduje się wewnątrz kręgosłupa. Stanowi połączenie mózgowia z resztą ciała.\n" +
                "\tb) mózgowie - szczegółowo opisane w drugiej części aplikacji\n" +
                "Obwodowy Układ Nerwowy\n" +
                "\ta) układ somatyczny - unerwia mięśnie szkieletowe. Podlega on nasze woli, dzięki czemu możemy świadomie i celowo poruszać np. kończynami\n" +
                "\tb) układ autonomiczny - unerwia narządy wewnętrzne. Nie jest zależny od naszej woli. \n" +
                "\t\t* układ współczulny (sympatyczny) - aktywuje się, kiedy organizm przygotowuje się do działania (np. walki, ucieczki). \n" +
                "\t\t* układ przywspółczulny (parasympatyczny) - aktywuje się, kiedy odpoczywamy, relaksujemy się.");
        tv.setWidth(100);
        tv.setHeight(40);
        layout.addView(tv);
        setContentView(layout);
    }



}
