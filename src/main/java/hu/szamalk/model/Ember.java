package hu.szamalk.model;

import java.io.Serializable;

public class Ember implements Comparable<Ember>, Serializable {
    private String nev;
    private int kor;
    private String cim;

    public Ember(String nev, int kor, String cim) {
        this.nev = nev;
        this.kor = kor;
        this.cim = cim;
    }

    public static NevComparator rendezNev(){
        return new NevComparator();
    }

    public static CimComperator rendezCim(){
        return new CimComperator();
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "Ember{" +
                "nev='" + nev + '\'' +
                ", kor=" + kor +
                ", cim='" + cim + '\'' +
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
