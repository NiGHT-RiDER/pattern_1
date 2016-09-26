package Observers;

/**
 * Created by nightrider on 26/09/16.
 */
public class BelgiqueObserver implements IObserver {

    private int nbBelgique ;

    public BelgiqueObserver() {
        this.nbBelgique = 0;
    }

    @Override
    public void update(String current) {
        for (String s : current.split(" ")) {
            if(s.toLowerCase().equals("belgique")){
                nbBelgique++;
            }
        }
    }

    @Override
    public String result() {
        return "il y avait le mot belgique " + nbBelgique + " fois au total.";
    }
}
