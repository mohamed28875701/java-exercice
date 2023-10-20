package tn.esprit.gestionZoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animals{
    protected String habitat;
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
    public abstract void swim();

    @Override
    public boolean equals(Object obj) {
        if(null == obj) return false;
        if(obj instanceof Aquatic aquatic){
            return this.habitat.equals(aquatic.habitat) && this.name.equals(aquatic.name) && this.age==aquatic.age;
        }
        return false;
    }
}
