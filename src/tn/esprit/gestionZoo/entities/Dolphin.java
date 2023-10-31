package tn.esprit.gestionZoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed;

    public Dolphin() {

    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"\nswimming speed "+swimmingSpeed;
    }
    public void swim(){
        System.out.println("this dolphin can swim");
    }

    @Override
    public void eatMeat(Food meat) {
        if(meat.equals(Food.MEAT))
            System.out.println("this dolphin eats meat");
        else
            System.out.println("this dolphin doesnt eat meat");
    }
}
