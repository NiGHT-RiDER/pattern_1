package Observers;

/**
 * Created by nightrider on 26/09/16.
 */
public class LigneObserver implements IObserver {

    private int lignes ;

    public LigneObserver() {
        this.lignes = 0;
    }

    @Override
    public void update(String current) {
        if(current != "")
            lignes++;
    }

    @Override
    public String result() {
        return "Il y avait " + lignes + " lignes au total.";
    }
}
