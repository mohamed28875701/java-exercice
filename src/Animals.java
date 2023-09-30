public class Animals {
    String family;
    String name;
    int age;
    boolean isMammal;

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

}


