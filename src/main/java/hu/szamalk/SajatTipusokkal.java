package hu.szamalk;

import hu.szamalk.model.Ember;
import hu.szamalk.model.NevComparator;

import java.util.Arrays;

public class SajatTipusokkal {
    public SajatTipusokkal() {
        Ember e0 = new Ember("Pál", 4);
        Ember e1 = new Ember("Ede", 24);
        Ember e2 = new Ember("Anna", 43);
        Ember e3 = new Ember("Péter", 20);
        Ember e4 = new Ember("Dorka", 200000);
        Ember e5 = new Ember("Éva", 1000);
        Ember[] emberek = {e0,e1,e2,e3,e4,e5};
        kiirTomb("Eredeti Ember tömb", emberek);
        //alapértelmezett rendezés comparable
        Arrays.sort(emberek);
        kiirTomb("Alapértelmezett rendezett Ember tömb(kor)", emberek);
        //egyéni rendezés comparator
        Arrays.sort(emberek, Ember.rendezNev());
        kiirTomb("Egyéni rendezett Ember tömb(név)", emberek);


    }

    private <T> void kiirTomb(String cim, T[] tomb){
        System.out.println(cim);
        for(T elem : tomb){
            System.out.print(elem);
        }
        System.out.println("\n");
    }
}
