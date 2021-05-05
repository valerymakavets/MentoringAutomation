package com.epam.learning.car.initializer;

import com.epam.learning.car.data.CarDataGenerator;
import com.epam.learning.car.model.Brand;
import com.epam.learning.car.model.Car;
import com.epam.learning.car.model.Colour;

public class CarPoolInitializer {

    public static Car[] generateCarPool(int numberOfCars) {
        Car[] cars = new Car[numberOfCars];
        for (int i = 0; i < cars.length; i++) {
            Car car = new Car(i + 1, Brand.getRandom(), CarDataGenerator.generateModel(),
                    CarDataGenerator.generateProductionYear(), Colour.generateRandom(),
                    CarDataGenerator.generatePrice(), CarDataGenerator.generateRegistrationNumber());
            cars[i] = car;
        }
        return cars;
    }

    public static Car[] addCarToPool(Car[] carPool, Car car) {
        int sizeOfInitialCarPool = carPool.length;
        int sizeOfUpdatedCarPool = sizeOfInitialCarPool + 1;
        Car[] updatedCarPool = new Car[sizeOfUpdatedCarPool];
        for (int i = 0; i < sizeOfInitialCarPool; i++) {
            updatedCarPool[i] = carPool[i];
        }
        updatedCarPool[sizeOfUpdatedCarPool - 1] = car;
        return updatedCarPool;
    }
}
