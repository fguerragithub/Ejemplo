package es.ulpgc.da.ejemplo.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.ulpgc.da.ejemplo.MediatorCounter;
import es.ulpgc.da.ejemplo.R;

public class ViewCounter extends Activity implements IViewCounter {

    private TextView display;

    public void setDisplay(String display){
        this.display.setText(display);
    }

    private MediatorCounter mediatorCounter(){
        return (MediatorCounter)this.getApplication();
    }

    // Esta actividad es la principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.display);

        Button boton = (Button)findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediatorCounter().getPresenterCounter().onClickBoton();
            }
        });

        mediatorCounter().setMVP(this);
    }
}
