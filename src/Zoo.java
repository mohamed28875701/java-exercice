public class Zoo {
    Animals[] animals;
    int nbrAnimals;
    String name;
    String city;
    final int nbrCages=25;

    public Zoo(String name,String city){
        animals=new Animals[nbrCages];
        this.name=name;
        this.city=city;
    }
    void displayZoo(){
        System.out.println("name :"+name+"\ncity : "+city+"\nnombre de cages : "+nbrCages);
    }

    @Override
    public String toString() {
        return "name :"+name+"\ncity : "+city+"\nnombre de cages : "+nbrCages;
    }
    public boolean addAnimal(Animals animal){
        if(searchAnimal(animal)!=-1) return false;
        for(int i=0;i!=animals.length;i++){
            if(animals[i]==null){
                animals[i]=animal;
                nbrAnimals++;
                return true;
            }
        }
        return false;
    }
    public void displayAnimals(){
        for(int i = 0;animals[i]!=null;i++){
            System.out.println(animals[i]);
        }
    }
    public int searchAnimal(Animals animal){
        for(int i =0;animals[i]!=null;i++){
            if(animals[i].name==animal.name){
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
        return nbrAnimals>nbrCages;
    }
    public static Zoo comparerZoo(Zoo zoo1,Zoo zoo2){
        return zoo1.nbrAnimals> zoo2.nbrCages?zoo1:zoo2;
    }
}
