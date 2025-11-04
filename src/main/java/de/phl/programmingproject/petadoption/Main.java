package de.phl.programmingproject.petadoption;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
        
        Pet pet = new Pet("Buddy", 3, "Labrador Retriever");

        
        Adopter adopter = new Adopter("Jane Smith", "555-555-5555", "janesmith@email.com");

        
        System.out.println(" Haustierinformationen:");
        System.out.println(pet.getInfo());

        
        System.out.println("Adoptierendeninformationen:");
        System.out.println(adopter.getInfo());

        
        System.out.println("Wurde das Haustier adoptiert? " + pet.isAdopted());

        
        Adoption adoption = pet.adopt(adopter, new Date());

        
        System.out.println("Adoptionsinformationen:");
        System.out.println(adoption.getInfo());

        
        System.out.println("Wurde das Haustier adoptiert? " + pet.isAdopted());
    }
}

    

