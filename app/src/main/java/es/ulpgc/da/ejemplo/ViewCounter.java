package es.ulpgc.da.ejemplo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewCounter extends Activity {

    private PresenterCounter presenterCounter;
    private TextView display;
    private Button boton;

    public class BotonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            presenterCounter.onClickBoton1();
        }
    }

    public void setDisplay(String display){
        this.display.setText(display);
    }

    // Esta actividad es la principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.display);

        boton   = (Button)findViewById(R.id.boton);
        boton.setOnClickListener(new BotonListener());

        presenterCounter = new PresenterCounter(this);
    }
}
