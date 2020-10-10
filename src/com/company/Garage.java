package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Garage {
    private final ArrayList<Car> cars;
    private final Scanner userInput;

    public Garage() {

        this.cars = new ArrayList<>();
        userInput = new Scanner(System.in);
    }

    private int concessionaireSize() {
        int capacity;
        System.out.println("Enter Dealer's capacity");
        capacity = Integer.parseInt(userInput.nextLine());
        return capacity;
    }

    private void insertCarData() {
        int count = 1;
        int capacity = concessionaireSize();

        while (count <= capacity) {
            System.out.println("Please insert the car's number plate:");
            String plate = userInput.nextLine();
            System.out.println("Enter car's brand: ");
            String brand = userInput.nextLine();
            System.out.println("Enter the car model:");
            String model = userInput.nextLine();
            System.out.println("Enter the year of the car:");
            int year = Integer.parseInt(userInput.nextLine());
            Car car = new Car(plate, brand, model, year);
            saveCar(car);
            count++;

        }
    }

    private void saveCar(Car car) {
        cars.add(car);
    }

    private void displayCarCount() {
        System.out.println("The global variable counter is set to: " + Car.count);
    }

    private void displayCarData() {
        System.out.println("*********** LIST OF CARS ************* ");
        cars.forEach(car -> {
            System.out.println("Plate: " + car.getNUMBER_PLATE());
            System.out.println("Brand: " + car.getBRAND());
            System.out.println("Model: " + car.getMODEL());
            System.out.println("Year: " + car.getYEAR());
            System.out.println("******************************************* ");
        });

    }

    protected void manage() {
        insertCarData();
        displayCarCount();
        displayCarData();
    }

}


