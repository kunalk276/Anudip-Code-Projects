package lab5;
abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle();
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
