package es.ulpgc.da.ejemplo;

import android.app.Application;

import es.ulpgc.da.ejemplo.model.IModelCounter;
import es.ulpgc.da.ejemplo.model.ModelCounter;
import es.ulpgc.da.ejemplo.presenter.IPresenterCounter;
import es.ulpgc.da.ejemplo.presenter.PresenterCounter;
import es.ulpgc.da.ejemplo.view.IViewCounter;

/**
 * Created by fguerra on 30/1/17.
 */

public class MediatorCounter extends Application {
    private IModelCounter     modelCounter;
    private IViewCounter      viewCounter;
    private IPresenterCounter presenterCounter;

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
