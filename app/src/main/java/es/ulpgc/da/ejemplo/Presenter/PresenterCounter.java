package es.ulpgc.da.ejemplo.presenter;

import es.ulpgc.da.ejemplo.MediatorCounter;

public class PresenterCounter implements IPresenterCounter{
    private MediatorCounter mediatorCounter;

    public PresenterCounter(MediatorCounter mediatorCounter) {
        this.mediatorCounter = mediatorCounter;
    }

    public void onClickBoton() {
        mediatorCounter.getModelCounter().setNextCounter();
        mediatorCounter.getViewCounter().setDisplay(mediatorCounter.getModelCounter().toString());
    }
}