package Observers;

/**
 * Created by nightrider on 26/09/16.
 */
public class MotsObserver implements IObserver {

    private int nbMots;

    public MotsObserver() {
        this.nbMots = 0;
    }

    @Override
    public void update(String current) {
        nbMots += current.split(" ").length;
    }

    @Override
    public String result() {
        return "Il y avait " + nbMots + " mots au total.";
    }
}
