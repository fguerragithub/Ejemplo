package es.ulpgc.da.ejemplo.model;

public class ModelCounter implements IModelCounter{
    private int counter;

    public ModelCounter() {
        counter = 0;
    }

    public int getCounter(){
        return counter;
    }
    public void setNextCounter(){
        counter++;
    }

    @Override
    public String toString(){
        return ((Integer) getCounter()).toString();
    }
}