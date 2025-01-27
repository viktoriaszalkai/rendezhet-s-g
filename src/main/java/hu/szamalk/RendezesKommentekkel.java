package hu.szamalk;

import java.util.Arrays;

public class RendezesKommentekkel {
    public RendezesKommentekkel() {
//        int [] egeszTomb = {1,4,3,6,5,8,7,2};
        Integer [] egeszTomb = {1,4,3,6,5,8,7,2};

//        kiirEgeszTomb("Eredeti int tömb: ", egeszTomb);
        kiirTomb("Eredeti int tömb: ", egeszTomb);
        Arrays.sort(egeszTomb);
//        kiirEgeszTomb("Rendezett int tömb: ", egeszTomb);
        kiirTomb("Rendezett int tömb: ", egeszTomb);

        String [] szovegTomb = {"h","a","c","g", "e", "b", "d", "f"};

//        kiirSzovegTomb("Eredeti String tömb: ", szovegTomb);
        kiirTomb("Eredeti String tömb: ", szovegTomb);
        Arrays.sort(szovegTomb);
//        kiirSzovegTomb("Rendezett String tömb: ", szovegTomb);
        kiirTomb("Rendezett String tömb: ", szovegTomb);

    }

// GENERIKUS TÍPUSPARAMÉTER
    private <T> void kiirTomb(String cim, T[] tomb){
        System.out.println(cim);
        for(T elem : tomb){
            System.out.print(elem);
        }
        System.out.println("\n");
    }

//    public void kiirEgeszTomb(String cim, int[] tomb){
//        System.out.println(cim);
//        for (int i = 0; i < tomb.length; i++) {
//            System.out.print(tomb[i]);
//        }
//        System.out.println("\n");
//    }
//
//    public void kiirSzovegTomb(String cim, String[] tomb){
//        System.out.println(cim);
//        for (int i = 0; i < tomb.length; i++) {
//            System.out.print(tomb[i]);
//        }
//        System.out.println("\n");
//    }
}
