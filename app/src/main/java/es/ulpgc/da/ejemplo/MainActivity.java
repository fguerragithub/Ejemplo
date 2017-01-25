package es.ulpgc.da.ejemplo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity {

    private TextView display;
    private Button boton1;
    private int contador;

    public class BotonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            contador++;
            display.setText(((Integer)contador).toString());
        }
    }

    // Esta actividad es la principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        boton1 = (Button)findViewById(R.id.boton1);
        display = (TextView)findViewById(R.id.display);
        boton1.setOnClickListener(new BotonListener());
    }
}
