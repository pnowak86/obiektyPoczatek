package org.mytools.myclasses;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Car myCar = new Car(3,"mercedes");
        Car myCar2 = new Car("opel");
        myCar2.setWheelCount(5);

        System.out.println(myCar.toString());
        System.out.println(myCar2.toString());

        myCar.doBlink();
        System.out.println("myCar: " + myCar.getWheelCount()+ " " +  "wheels");
        System.out.println("myCar is " + myCar.getBrand());

        System.out.println("myCar2: " + myCar2.getWheelCount()+ " " +  "wheels");
        System.out.println("myCar2 is " + myCar2.getBrand());



        //myCar.similarCar.doBlink();

        //myCar2.doBlink();

    }
}
