package com.company;

public class Car {
    private final String NUMBER_PLATE;
    private final String MODEL;
    private final String BRAND;
    private final int YEAR;
    public static int count = 0;

    public Car(String numberPlate, String model, String brand, int year) {
        NUMBER_PLATE = numberPlate;
        MODEL = model;
        BRAND = brand;
        this.YEAR = year;
        count++;
    }


    public String getNUMBER_PLATE() {
        return NUMBER_PLATE;
    }

    public String getMODEL() {
        return MODEL;
    }

    public String getBRAND() {
        return BRAND;
    }

    public int getYEAR() {
        return YEAR;
    }

}
