package com.epam.learning.car.util;

import com.epam.learning.car.model.Brand;
import com.epam.learning.car.model.Car;

import java.time.LocalDate;

public class CarStatisticHandler {

    public static void printCarsOfSpecifiedBrand(Car[] carPool, Brand brand) {
        System.out.println("List of cars with brand " + brand);
        for (int i = 0; i < carPool.length; i++) {
            if (carPool[i].getBrand().equals(brand)) {
                System.out.println(carPool[i]);
            }
        }
    }

    public static void printCarsOfSpecifiedModelAndYearsOfLifespan(Car[] carPool, String model, int lifespan) {
        System.out.println("List of cars with model " + model + " and years of work >= " + lifespan + " years");
        for (int i = 0; i < carPool.length; i++) {
            int carAge = LocalDate.now().getYear() - carPool[i].getProductionYear();
            if (carPool[i].getModel().equals(model) & carAge > lifespan) {
                System.out.println(carPool[i]);
            }
        }
    }

    public static void printCarsOfSpecifiedProductionYearAndPrice(Car[] carPool, int productionYear, double price) {
        System.out.println("List of cars produced in " + productionYear + " and with price > " + price + " $");
        for (int i = 0; i < carPool.length; i++) {
            if (carPool[i].getProductionYear() == productionYear & carPool[i].getPrice() > price) {
                System.out.println(carPool[i]);
            }
        }
    }

}
