package es.ulpgc.da.ejemplo.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.da.ejemplo.presenter.PresenterCounter;
import es.ulpgc.da.ejemplo.presenter.IPresenterCounter;
import es.ulpgc.da.ejemplo.R;

public class ViewCounter extends Activity implements IViewCounter {

    private IPresenterCounter presenterCounter;
    private TextView display;
    private Button boton;

    public class BotonListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            presenterCounter.onClickBoton();
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
