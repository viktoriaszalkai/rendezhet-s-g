package hu.szamalk.model;

import java.util.Comparator;

public class Ember implements Comparable<Ember>{
    private String nev;
    private int kor;

    public Ember(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
    }

    public static NevComparator rendezNev(){
        return new NevComparator();
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                ", kor=" + kor +
                '}';
    }

    @Override
    public int compareTo(Ember masik) {
        //egész
//        if(this.kor < masik.kor){
//            return -1;
//        }else if(this.kor > masik.kor){
//            return 1;
//        }
//        return 0;
          return this.kor - masik.kor;
//        szöveg
//        return this.nev.compareTo(masik.nev);
//        Collator collator = Collator.getInstance();
//        return collator.compare(this.nev, masik.nev);

    }
}
