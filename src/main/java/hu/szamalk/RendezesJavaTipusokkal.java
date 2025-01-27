package hu.szamalk;


import java.util.*;

public class RendezesJavaTipusokkal {
    public RendezesJavaTipusokkal() {
        Integer [] egeszTomb = {1,4,3,6,5,8,7,2};

        kiirTomb("Eredeti int tömb: ", egeszTomb);
        Arrays.sort(egeszTomb);
        kiirTomb("Rendezett int tömb: ", egeszTomb);

        String [] szovegTomb = {"h","a","c","g", "e", "b", "d", "f"};

        kiirTomb("Eredeti String tömb: ", szovegTomb);
        Arrays.sort(szovegTomb);
        kiirTomb("Rendezett String tömb: ", szovegTomb);

//      List<Integer> egeszLista = List.of(2,3,5,2,6,81,3);
        List<Integer> egeszLista = Arrays.asList(egeszTomb);
        Collections.shuffle(egeszLista); //összekeverem
        kiirLista("Eredeti egeszLista:",egeszLista);
        Collections.sort(egeszLista);
        kiirLista("Rendezett egeszLista:",egeszLista);

        List <Character> betukLista = new ArrayList<>();
        betukLista.add('c');
        betukLista.add('f');
        betukLista.add('%');
        betukLista.add('!');
        betukLista.add('k');
        betukLista.add('*');

        kiirLista("Eredeti character lista:",betukLista);
        Collections.sort(betukLista);
        kiirLista("Rendezett character lista:",betukLista);
    }


    private <T> void kiirLista(String cim, List<T> lista){
        System.out.println(cim);
        for(T elem : lista){
            System.out.print(elem);
        }
        System.out.println("\n");
    }


// GENERIKUS TÍPUSPARAMÉTER
    private <T> void kiirTomb(String cim, T[] tomb){
        System.out.println(cim);
        for(T elem : tomb){
            System.out.print(elem);
        }
        System.out.println("\n");
    }





}
