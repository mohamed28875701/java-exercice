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
          Aquatic aquatic = new Aquatic() {
                @Override
                public void swim() {
                      System.out.println("this aquatic swims");
                }

                @Override
                public void eatMeat(Food meat) {
                        if(meat.equals(Food.MEAT))
                              System.out.println("this animal eats meat");
                        else
                              System.out.println("this aquatic doesnt eat meat");
                }
          };
          aquatic.eatMeat(Food.PLANT);
          Penguin peng=new Penguin("birds","dol",3,false,"antartica",2.4f);
          peng.eatMeat(Food.MEAT);
          Terrestrial ter=new Terrestrial("pig","hacoona",4,true,4);
          ter.eatPlantAndMeat(Food.BOTH);
          ter.eatPlantAndMeat(Food.MEAT);
    }
}