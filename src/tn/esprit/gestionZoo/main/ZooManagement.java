package tn.esprit.gestionZoo.main;

import tn.esprit.gestionZoo.entities.*;

class ZooManagement {
    public static void main(String[] args) {
          Animals lion = new Animals("feline","lion",4,true);
          Animals duck = new Animals("bird","duck",4,false);
          Animals cat = new Animals("feline","cat",2,false);
          Zoo myZoo=new Zoo("yay","bizerte");
          myZoo.addAnimal(lion);
          myZoo.addAnimal(duck);
          System.out.println(myZoo.removeAnimal(lion));
          Terrestrial terrestrialAnimal=new Terrestrial();
          Aquatic dol=new Dolphin("fish","doph",5,true,"ocean",5.25f);
          Aquatic dol1=new Dolphin("fish","doph",5,true,"ocean",5.25f);
          Aquatic peg=new Penguin("bird","penguin",4,false,"antartica",12);
          Aquatic peg1=new Penguin("bird","penguin",4,false,"antartica",15);
          Aquatic peg2=new Penguin("bird","penguin1",4,false,"antartica",18);
          System.out.println(myZoo.addAquaticAnimal(dol));
          System.out.println(myZoo.addAquaticAnimal(dol1));
          System.out.println(myZoo.addAquaticAnimal(peg));
          System.out.println(myZoo.addAquaticAnimal(peg1));
          System.out.println(myZoo.addAquaticAnimal(peg2));

          System.out.println(myZoo.maxPenguinSwimmingDeapth());
          myZoo.displayNumberOfAquaticByType();
          System.out.println(peg.equals(peg1));
          System.out.println(peg1.equals(peg2));


    }
}