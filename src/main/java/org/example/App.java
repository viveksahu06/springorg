package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Beans.xml");
        Car car1=  applicationContext.getBean(Car.class);
       // Car car2=  applicationContext.getBean(Car.class);
        car1.drive();
       //// System.out.println(car1.hashCode());
      //  System.out.println(car2.hashCode());
    }
}
