package org.example;

public class Car {
    Engine engine;
   Car(){
       System.out.println("car constructor is called");
   }
    public void setEngine(Engine engine) {
        System.out.println("car setter Method...");
        this.engine = engine;
    }
    public void drive(){
       int start= engine.start();
       if(start>=1){
           System.out.println("cat started with good   engine");
       }
       else{
           System.out.println("Engine not working");
       }
    }
}
