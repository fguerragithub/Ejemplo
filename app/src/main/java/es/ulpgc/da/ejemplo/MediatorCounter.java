package es.ulpgc.da.ejemplo;

import android.app.Application;
import android.content.Intent;

import es.ulpgc.da.ejemplo.model.IModelCounter;
import es.ulpgc.da.ejemplo.model.ModelCounter;
import es.ulpgc.da.ejemplo.presenter.IPresenterCounter;
import es.ulpgc.da.ejemplo.presenter.PresenterCounter;
import es.ulpgc.da.ejemplo.view.IViewCounter;
import es.ulpgc.da.ejemplo.view.ViewCounter;

/**
 * Created by fguerra on 30/1/17.
 */

public class MediatorCounter extends Application {
    private IModelCounter     modelCounter;
    private IPresenterCounter presenterCounter;
    private IViewCounter      viewCounter;

    @Override
    public void onCreate() {
        super.onCreate();
        startActivity(new Intent(this, ViewCounter.class));
    }

    public IPresenterCounter getPresenterCounter(){
        return presenterCounter;
    }

    public IModelCounter getModelCounter(){
        return modelCounter;
    }

    public IViewCounter getViewCounter(){
        return viewCounter;
    }

    public void setMVP(IViewCounter viewCounter){
        this.viewCounter      = viewCounter;
        this.modelCounter     = new ModelCounter();
        this.presenterCounter = new PresenterCounter(this);
    }

}
