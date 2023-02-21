package com.example.main;

// Java program to illustrate the
// concept of inheritance

// base class
class Car {
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Car class has one constructor
    public Car(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the Car class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }

    public void speedUp(int increment)
    {
        speed += increment;
    }

    // toString() method to print info of Bicycle
    public String toString()
    {
        return ("No of gears are " + gear + "\n"
                + "speed of Car is " + speed);
    }
}

// derived class
class SportsCar extends Car {

    // the SportsCar subclass adds one more field
    public int seatHeight;

    // the SportsCar subclass has one constructor
    public SportsCar(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(Car) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    // the SportsCar subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Car to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// driver class
public class TestInheritance {
    public static void main(String args[])
    {
        SportsCar mb = new SportsCar(3, 100, 25);
        System.out.println(mb.toString());
    }
}