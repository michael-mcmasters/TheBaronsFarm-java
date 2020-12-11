package hbcu.stay.ready.baronsfarm.interfaces;

public interface Produce {

    public boolean hasBeenHarvested = false;
    public boolean hasBeenFertilized = false;

    public void harvest();
    public void fertilize();
    public Edible yield();

    public Boolean getHasBeenHarvested();
    public Boolean hasBeenFertilized();
}
