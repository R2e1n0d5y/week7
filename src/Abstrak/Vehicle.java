package Abstrak;

abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Mobil itu berjalan");
    }
}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("Perahu itu berlayat");
    }
}  
