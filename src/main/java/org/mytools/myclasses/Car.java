package org.mytools.myclasses;

/**
 * Created by RENT on 2017-04-26.
 */
public class Car {

    int wheelCount = 4;
    String brand = "skoda";

    Car[] similarCars = new Car[10];




    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brang) {
        this.brand = brang;
    }

    public Car[] getSimilarCars() {
        return similarCars;
    }

    public void setSimilarCars(Car[] similarCars) {
        this.similarCars = similarCars;
    }



    //Car similarCar = new Car();

    Car(){
        wheelCount = 9;
        brand = "star";
        System.out.println("in costructor");
    }

    public Car(int wheelCount, String brand) {
        this.wheelCount = wheelCount;
        this.brand = brand;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    void doBlink() {
        System.out.println("blink! blink!");
    }

}
