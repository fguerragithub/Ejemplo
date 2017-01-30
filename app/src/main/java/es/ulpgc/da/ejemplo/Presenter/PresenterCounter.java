package es.ulpgc.da.ejemplo.presenter;

import es.ulpgc.da.ejemplo.model.ModelCounter;
import es.ulpgc.da.ejemplo.model.IModelCounter;
import es.ulpgc.da.ejemplo.view.IViewCounter;

public class PresenterCounter implements IPresenterCounter{
    private IViewCounter viewCounter;
    private IModelCounter modelCounter;

    public PresenterCounter(IViewCounter viewCounter) {
        this.viewCounter = viewCounter;
        this.modelCounter = new ModelCounter();
    }

    public void onClickBoton() {
        modelCounter.setNextCounter();
        viewCounter.setDisplay(modelCounter.toString());
    }
}