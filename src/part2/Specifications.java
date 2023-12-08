package part2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Specifications {
    public static Car[] findCarsByModelName(Car[] cars, String model) {
        // Список автомобілів заданої моделі

        int j = 0;
        Car[] carsOfModel = new Car[cars.length];
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                carsOfModel[j] = car;
                j++;
            }
        }
        return Arrays.copyOf(carsOfModel, j);

    }
    public static Car[] vehicleOperation(Car[] cars, String model,int n) {
        // Список автомобілів заданої моделі, які експлуатуються більше n років
        int j = 0;
        LocalDate date = LocalDate.now();
        Car[] oldCarsOfModel = new Car[cars.length];
        for (Car car : cars) {
            if (car.getModel().equals(model) && (date.getYear() - car.userDate().getYear()) > n ) {
                oldCarsOfModel[j++]=car;
            }
        }
        return Arrays.copyOf(oldCarsOfModel, j);
    }


    public static Car[] carsPrice(Car[] cars,double minPrice,LocalDate year) {
        // Список автомобілів заданого року випуску ціна яких вище вказаної
        int j = 0;
        Car [] carsOfYearAndPrice = new Car[cars.length];
        for (Car car : cars) {
            if (car.userDate().isEqual(year) && car.getPrice() > minPrice) {
                carsOfYearAndPrice[j++]=car;
            }
        }
        return Arrays.copyOf(carsOfYearAndPrice, j);
    }
}
