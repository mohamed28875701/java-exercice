package tn.esprit.gestionZoo.entities;

public class Aquatic extends Animals{
    private String habitat;
    public Aquatic(){super();}
    public Aquatic(String family,String name,int age,boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHabitat "+habitat;
    }
    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }
}
