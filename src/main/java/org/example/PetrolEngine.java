package org.example;

public class PetrolEngine implements Engine{

    PetrolEngine(){
        System.out.println("petrol Engine constructor...");
    }
    @Override
    public int start() {
        System.out.println("petrol Engine Started...");
        return 1;
    }
}
