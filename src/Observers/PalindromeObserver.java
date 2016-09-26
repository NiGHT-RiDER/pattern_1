package Observers;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Created by nightrider on 26/09/16.
 */
public class PalindromeObserver implements IObserver{

    int nbPalindromes ;

    public PalindromeObserver() {
        this.nbPalindromes = 0;
    }

    @Override
    public void update(String current) {
        for(String s : current.split(" ")){
            System.out.println(s);
            System.out.println(new StringBuilder(s).reverse());
            if(s.equals((new StringBuilder(s).reverse().toString())))
                nbPalindromes++;
        }
    }

    @Override
    public String result() {
        return "Il y avait " + nbPalindromes + " palindromes au total.";
    }
}
