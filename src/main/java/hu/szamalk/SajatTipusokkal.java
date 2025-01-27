package hu.szamalk;

import hu.szamalk.model.Ember;

import java.util.Arrays;

public class SajatTipusokkal {
    public SajatTipusokkal() {
        Ember e0 = new Ember("Pál", 4,"Bp");
        Ember e1 = new Ember("Adél", 24,"Budaors");
        Ember e2 = new Ember("Anna", 43,"Göd");
        Ember e3 = new Ember("Péter", 20,"Szöged");
        Ember e4 = new Ember("Dorka", 200000,"MucsaRöcsöge");
        Ember e5 = new Ember("Éva", 1000, "Bp");
        Ember[] emberek = {e0,e1,e2,e3,e4,e5};
        kiirTomb("Eredeti Ember tömb", emberek);
        //alapértelmezett rendezés comparable
        Arrays.sort(emberek);
        kiirTomb("Alapértelmezett rendezett Ember tömb(kor)", emberek);
        //egyéni rendezés comparator
        Arrays.sort(emberek, Ember.rendezNev());
        kiirTomb("Egyéni rendezett Ember tömb(név)", emberek);
        kiirTomb("Egyéni rendezett Ember tömb(cim)", emberek);
        Arrays.sort(emberek, Ember.rendezCim());

    }

    private <T> void kiirTomb(String cim, T[] tomb){
        System.out.println(cim);
        for(T elem : tomb){
            System.out.print(elem);
        }
        System.out.println("\n");
    }
}
