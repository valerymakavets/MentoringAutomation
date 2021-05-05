package com.epam.learning.car;

import com.epam.learning.car.data.CarDataGenerator;
import com.epam.learning.car.initializer.CarPoolInitializer;
import com.epam.learning.car.model.Brand;
import com.epam.learning.car.model.Car;
import com.epam.learning.car.util.CarStatisticHandler;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        int numberOfCars = 1000;
        Car[] cars = CarPoolInitializer.generateCarPool(numberOfCars);

        Brand targetBrand = Brand.getRandom();
        CarStatisticHandler.printCarsOfSpecifiedBrand(cars, targetBrand);

        String targetModel = CarDataGenerator.generateModel();
        int lifespan = new Random().nextInt(15);
        CarStatisticHandler.printCarsOfSpecifiedModelAndYearsOfLifespan(cars, targetModel, lifespan);

        int productionYear = CarDataGenerator.generateProductionYear();
        double price = CarDataGenerator.generatePrice();
        CarStatisticHandler.printCarsOfSpecifiedProductionYearAndPrice(cars, productionYear, price);
    }
}
