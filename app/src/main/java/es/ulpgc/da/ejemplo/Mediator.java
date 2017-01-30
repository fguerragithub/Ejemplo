package es.ulpgc.da.ejemplo;

import android.app.Application;
import android.content.Intent;

import es.ulpgc.da.ejemplo.view.ViewCounter;

/**
 * Created by fguerra on 30/1/17.
 */

public class Mediator extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        startActivity(new Intent(this,ViewCounter.class));
    }
}
