package tn.esprit.gestionZoo.entities;

public class Animals {
    private String family;
    private String name;
    private int age;


    private boolean isMammal;

    public Animals(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal(){
        System.out.println("family : "+family+"\nname : "+name+"\nage : "+age +"\nismammal :" +isMammal);
    }

    @Override
    public String toString() {
        return "family : "+family+"\nname : "+name+"\nage : "+age +"\nismammal :" +isMammal;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age<0) return;
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }


}


