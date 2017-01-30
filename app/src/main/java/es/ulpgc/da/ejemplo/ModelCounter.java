package es.ulpgc.da.ejemplo;

public class ModelCounter {
    private int counter;

    public ModelCounter() {
        counter = 0;
    }
    public int getCounter(){
        return counter;
    }
    @Override
    public String toString(){
        return ((Integer) getCounter()).toString();
    }
    public void setNextCounter(){
        counter++;
    }
}