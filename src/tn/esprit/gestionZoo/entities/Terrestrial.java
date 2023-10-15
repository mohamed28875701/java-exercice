package tn.esprit.gestionZoo.entities;

public class Terrestrial extends Animals{
    private int nbrLegs;
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
}
