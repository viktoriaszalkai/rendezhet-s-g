- kisjegyek
- 2 vizsgaszintű feladat legyen min 2 az átlaguk
- tesztelés és szerializálás


Rendezhetőség
Java típusok:
tömb -> Arrays.sort()
lista -> Collections.sort()

<generikus> típusparaméter 

Tömb esetén
private <T> void kiirTomb(String cim, T[] tomb){
   System.out.println(cim);
   for(T elem : tomb){
       System.out.print(elem + " ");
   }
}


Lista esetén
private <T> void kiirLista(String cim, List<T> lista){
   System.out.println(cim);
   for(T elem : lista){
       System.out.print(elem);
   }
   System.out.println("\n");
}




Saját típusnál Comparable, compareTo
public class Ember implements Comparable<Ember>{


@Override
   public int compareTo(Ember masik) {
       //egész
//        if(this.kor < masik.kor){
//            return -1;
//        }else if(this.kor > masik.kor){
//            return 1;
//        }
//        return 0;
//        return this.kor - masik.kor;
       //szöveg
       return this.nev.compareTo(masik.nev);
   }
}


ékezetes betűk -> collator



Comparator - compare

public class NevComparator implements Comparator<Ember>{
  
   @Override
   public int compare(Ember egyik, Ember masik) {
       Collator c = Collator.getInstance();
       return collator.compare(egyik.getNev(), masik.getNev());
   }
  
}

//alapértelmezett rendezés comparable
Arrays.sort(emberek);
kiirTomb("Alapértelmezett rendezett Ember tömb(kor)", emberek);
//egyéni rendezés comparator
Arrays.sort(emberek, new NevComparator());
kiirTomb("Egyéni rendezett Ember tömb(név)", emberek);



