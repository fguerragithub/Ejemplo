package es.ulpgc.da.ejemplo;

public class PresenterCounter {
    private ViewCounter  viewCounter;
    private ModelCounter modelCounter;

    public PresenterCounter(ViewCounter viewCounter) {
        this.viewCounter = viewCounter;
        this.modelCounter = new ModelCounter();
    }

    void onClickBoton1() {
        modelCounter.setNextCounter();
        viewCounter.setDisplay(modelCounter+"");
    }
}