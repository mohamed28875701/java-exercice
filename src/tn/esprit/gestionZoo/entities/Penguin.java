package tn.esprit.gestionZoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;

    public Penguin() {
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat,float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth=swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString() + "\nswimming depth "+swimmingDepth;
    }
    public void swim(){
        System.out.println("this penguin is swimming");
    }
}
