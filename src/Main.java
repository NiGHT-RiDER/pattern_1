import Observers.*;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.ArrayList;

public class Main {

    private BufferedReader lecteur;
    private String ligne;

    public Main() throws FileNotFoundException {
        this.lecteur = new BufferedReader(new FileReader("test.txt"));
        this.ligne = "";
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();

        ArrayList<IObserver> observers = new ArrayList<>();
        observers.add(new BelgiqueObserver());
        observers.add(new MotsObserver());
        observers.add(new PalindromeObserver());
        observers.add(new LigneObserver());

        while ((m.ligne = m.lecteur.readLine()) != null) {
            for(IObserver obs : observers){
                obs.update(m.ligne);
            }
        }
        m.lecteur.close();
        for(IObserver obs : observers){
            System.out.println(obs.result());
        }
    }
}