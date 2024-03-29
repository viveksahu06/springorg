package org.example;

public class DieselEngine implements Engine{
    public DieselEngine() {
        System.out.println("Diesel engine constructor...");
    }

    @Override
    public int start() {
        System.out.println("Diesel Engine Started...");
        return 1;
    }
}
