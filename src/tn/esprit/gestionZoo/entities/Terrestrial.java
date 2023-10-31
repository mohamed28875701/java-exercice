package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animals implements Omnivore<Food>{
    protected int nbrLegs;
    public Terrestrial(){
        super();
    }
    public Terrestrial(String family ,String name,int age,boolean isMammal,int nbrLegs){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString()+"\nnombre legs "+nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if(meat.equals(Food.MEAT))
            System.out.println("this terrestrial eats meat");
        else
            System.out.println("this terrestrial does not eat ");
    }

    @Override
    public void eatPlant(Food plant) {
        if(plant.equals(Food.PLANT))
            System.out.println("this terrestrial eats plants");
        else
            System.out.println("this terrestrial does eats "+plant);
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if(food.equals(Food.BOTH))
            System.out.println("this terrestrial eats both foods");
        else
            System.out.println("this terrestrial does not eat both foods");
    }
}
