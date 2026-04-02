package study.ch12.ex;

class Vehicle {
    private String brand;

    public Vehicle (String brand) {
        this.brand = brand;
    }
    public void start() {
        System.out.println(brand + "시동켜기");
    }

    public String getBrand() {
        return brand;
    }
}

class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public void drive() {
        System.out.println(super.getBrand() + "주행중");
    }
}

class ElectricCar extends Car {
    private int battery;

    public ElectricCar(String brand, int doors, int battery) {
        super(brand, doors);
        this.battery = battery;
    }

    public void charge() {
        System.out.println(super.getBrand() + "충전중(" + battery +"%)");
    }
}

public class Ex02 {
    public static void main(String[] args) {

        ElectricCar a = new ElectricCar("현대", 4, 80);

        a.start();
        a.drive();
        a.charge();

    }
}
