package hbcu.stay.ready.baronsfarm.interfaces;

public abstract class Produce {

    protected boolean hasBeenHarvested = false;
    protected boolean hasBeenFertilized = false;

    public abstract void harvest();
    public abstract void fertilize();
    public abstract Edible yield();

    public abstract Boolean getHasBeenHarvested();
    public abstract Boolean getHasBeenFertilized();
}