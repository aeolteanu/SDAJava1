package oop.advanced.generictypes;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(240);
        GenericBox<Car> carBox = new GenericBox<>(car);

        System.out.println(carBox.getItem().getMaxSpeed());


        Car car2 = new Car(240);
        Garage<Car> garage = new Garage<>(car2);
        garage.repair();
        System.out.println(garage.getVehicle().getMaxSpeed());
        Garage<Vehicle> vehicle = new Garage<>(car2);
        vehicle.repair();
        System.out.println(vehicle.getVehicle().getMaxSpeed());


    }
}
