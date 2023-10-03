package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.Animals;
import tn.esprit.gestionZoo.entities.Zoo;

class ZooManagement {
    public static void main(String[] args) {
          Animals lion = new Animals("feline","lion",4,true);
          Animals duck = new Animals("bird","duck",4,false);
          Animals cat = new Animals("feline","cat",2,false);
          Zoo myZoo=new Zoo("yay","bizerte");

          myZoo.addAnimal(lion);
          myZoo.addAnimal(duck);
          myZoo.displayAnimals();
          System.out.println(myZoo.removeAnimal(lion));
          myZoo.displayAnimals();

    }
}