package hu.szamalk;

import hu.szamalk.model.Ember;

import java.io.*;
import java.util.Arrays;

public class Szerializacio {

    private Ember ember;
    private Ember[] emberek ;

    public Szerializacio() {
        ember = new Ember("Adél",23,"MR");
        emberek = new Ember[4];
        emberek[0] = ember;
        emberek[1] =new Ember("Dorka",20,"E");
        int i = (int)(Math.random()*emberek.length-1);
        emberek[2] = emberek[i];
        emberek[3] = emberek[i == 1 ? 0 : 1];
        szerialitzacio();
        deszerialitzacio();

    }

    private void szerialitzacio() {
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("emberek.ser"))) {
            objKi.writeObject(ember);
            objKi.writeObject(emberek);
        } catch (IOException e) {
           throw  new RuntimeException(e);
        }
    }

    private void deszerialitzacio() {
        try (ObjectInputStream objBe = new ObjectInputStream(new FileInputStream("emberek.ser"))){
            Ember beEmber = (Ember) objBe.readObject();
            Ember [] beEmberTomb = (Ember[]) objBe.readObject();
            System.out.println("A beolvasott emberek: ");
            System.out.println(beEmber);
            Arrays.asList(beEmberTomb).forEach(ember1 -> System.out.println(ember1));
        } catch (FileNotFoundException e) {
            throw  new RuntimeException(e);
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }catch (ClassNotFoundException e) {
            throw  new RuntimeException(e);
        }
    }

}
