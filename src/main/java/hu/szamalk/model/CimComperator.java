package hu.szamalk.model;

import java.text.Collator;
import java.util.Comparator;

public class CimComperator implements Comparator<Ember>{

    @Override
    public int compare(Ember egyik, Ember masik) {
        Collator c = Collator.getInstance();
        return c.compare(egyik.getCim(), masik.getCim());
    }

}
