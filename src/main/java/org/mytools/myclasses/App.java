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
        int wheels = 7;

        myCar2.setWheelCount(wheels);

        System.out.println(myCar.toString());
        System.out.println(myCar2.toString());

        myCar.doBlink();
        System.out.println("myCar: " + myCar.getWheelCount()+ " " +  "wheels");
        System.out.println("myCar is " + myCar.getBrand());

        System.out.println("myCar2: " + myCar2.getWheelCount()+ " " +  "wheels");
        System.out.println("myCar2 is " + myCar2.getBrand());

        System.out.println(myCar == myCar2);
        Car another = myCar2;//kopia referencji
        System.out.println("==========");
        System.out.println(myCar2.toString());
        System.out.println(another.toString());

        myCar2.setBrand("bmw");
        System.out.println(another.getBrand());
        System.out.println(myCar2 == another);


        myCar = myCar2;//nadpisujemy referencje od tego momentu myCar pokazuje na myCar2
        System.out.println(myCar);


        //myCar.similarCar.doBlink();

        //myCar2.doBlink();

    }
}
