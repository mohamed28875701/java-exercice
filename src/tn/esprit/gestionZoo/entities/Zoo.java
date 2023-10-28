package tn.esprit.gestionZoo.entities;

public class Zoo {
    private Animals[] animals;
    private int nbrAnimals;
    private String name;
    private String city;

    public Aquatic[] aquaticAnimals;

    private final int nbrCages=3;

    public Zoo(String name,String city){
        if(name.isEmpty()) {
            this.name="no empty";
        }
        animals=new Animals[nbrCages];
        aquaticAnimals=new Aquatic[10];
        this.city=city;
    }
    void displayZoo(){
        System.out.println("name :"+name+"\ncity : "+city+"\nnombre de cages : "+nbrCages);
    }

    @Override
    public String toString() {
        return "name :"+name+"\ncity : "+city+"\nnombre de cages : "+nbrCages;
    }
    public void addAnimal(Animals animal) throws ZooFullException,InvalidAgeException{
        //if(searchAnimal(animal)!=-1) return ;
        if(isFull()){

            throw new ZooFullException("the zoo is full");
        }
        if(animal.age<0) throw new InvalidAgeException("age is negative");
        for(int i=0;i!=animals.length;i++){
            if(animals[i]==null){
                animals[i]=animal;
                nbrAnimals++;
                System.out.println(nbrAnimals);
                return ;
            }
        }

    }
    public void displayAnimals(){
        for(int i = 0;animals[i]!=null;i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animals animal){
        for(int i =0;animals[i]!=null;i++){
            if(animals[i].getName().equals(animal.getName())){
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animals animal){
        if(searchAnimal(animal)==-1) return false;
        int index= searchAnimal(animal);
        int j =0,i=0;
        Animals[] newArr=new Animals[25];
        while(i!=newArr.length && animals[i]!=null){
            if(j==index)j++;
            newArr[i]=animals[j];
            i++;
            j++;
        }
        this.animals=newArr;
        nbrAnimals--;
        return true;
    }
    public boolean isFull(){
        return nbrAnimals==nbrCages;
    }
    public static Zoo comparerZoo(Zoo zoo1,Zoo zoo2){
        return zoo1.nbrAnimals> zoo2.nbrAnimals?zoo1:zoo2;
    }
    public boolean addAquaticAnimal(Aquatic animal){
        for(int i = 0;i!=aquaticAnimals.length;i++){
            if(aquaticAnimals[i]==null){
                aquaticAnimals[i]=animal;
                return true;
            }
        }
        return false;
    }
    public void displayAquaticAnimals(){
        for(int i =0;aquaticAnimals[i]!=null;i++)
            System.out.println(aquaticAnimals[i]);
    }
    public float maxPenguinSwimmingDeapth(){
        float max=0;
        for(int i =0;aquaticAnimals[i]!=null;i++){
            if(aquaticAnimals[i] instanceof Penguin){

                if(((Penguin) aquaticAnimals[i]).getSwimmingDepth()>max)
                    max=((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            }
        }
        return max;
    }
    public void displayNumberOfAquaticByType(){
        int penguins=0,dolphins=0;
        for(Aquatic aquatic:aquaticAnimals){
            if(aquatic instanceof Dolphin)
                dolphins++;
            if(aquatic instanceof Penguin)
                    penguins++;
        }
        System.out.println("penguins : "+penguins+" dolphins : "+dolphins);
    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public int getNbrCages() {
        return nbrCages;

    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        if(name.isEmpty()) return;
        this.name = name;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }
}
