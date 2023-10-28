package tn.esprit.gestionZoo.entities;

public class InvalidAgeException extends Exception{
    InvalidAgeException(){}
    InvalidAgeException(String message){
        super(message);
    }
}
