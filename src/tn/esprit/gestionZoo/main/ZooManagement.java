package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

class ZooManagement {
    public static void main(String[] args) {
          Animals lion = new Animals("feline","lion",-4,true);
          Animals duck = new Animals("bird","duck",4,false);
          Animals cat = new Animals("feline","cat",2,false);
          Animals cat1 = new Animals("feline","cat",2,false);
          Zoo myZoo=new Zoo("yay","bizerte");
          try{
                myZoo.addAnimal(lion);
                myZoo.addAnimal(duck);
                myZoo.addAnimal(cat);
                myZoo.addAnimal(cat1);

          }
          catch (ZooFullException|InvalidAgeException e){
                System.err.println(e.getMessage());
          }
          

    }
}