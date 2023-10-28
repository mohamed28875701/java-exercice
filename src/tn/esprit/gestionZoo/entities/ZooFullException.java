package tn.esprit.gestionZoo.entities;

public class ZooFullException extends Exception{
    ZooFullException(){
    }
    ZooFullException(String message){
        super(message);
    }
}
