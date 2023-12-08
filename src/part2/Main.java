package part2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Car[] cars = new Car[]{

                new Car(1, "Toyota Corolla", LocalDate.of(2015, 11, 4), 15000.0, "AA1234AA"),
                new Car(2, "Nissan Altima", LocalDate.of(2016, 12, 7), 17000.0, "BB2345BB"),
                new Car(3, "Honda Accord", LocalDate.of(2019, 1, 11), 12000.0, "CC3456CC"),
                new Car(4, "Toyota Corolla", LocalDate.of(2011, 11, 23), 18000.0, "DD4567DD"),
                new Car(5, "Nissan Maxima", LocalDate.of(2021, 3, 14), 10000.0, "EE5678EE")
        };

        System.out.print("Введіть назву моделі: ");
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        //Виклик метода
        Car[] carsOfModel = Specifications.findCarsByModelName(cars, model);
        System.out.println("Список автомобілів моделі " + model + ":");
        for (Car car : carsOfModel) {
            System.out.println(car);
        }
        System.out.print("Введіть вік машини: ");
        int userInput = Integer.parseInt(scanner.nextLine());
        //Виклик метода
        Car[] oldCarsOfModel = Specifications.vehicleOperation(cars, model, userInput);
        System.out.println("Список автомобілів моделі " + model + ", які експлуатуються більше " + userInput + " років:");
        for (Car car : oldCarsOfModel) {
            System.out.println(car);
        }
        System.out.println("Введіть рік випуску у форматі yyyy-mm-dd: ");
        LocalDate year = null;
        while (year == null) {
            String dateStr = scanner.nextLine();
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                year = LocalDate.parse(dateStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Введена некоректна дата. Спробуйте ще раз:");
            }
            System.out.print("Введіть мінімальну ціну: ");
            double minPrice = scanner.nextDouble();
            //Виклик метода
            Car[] carsPrice = Specifications.carsPrice(cars, minPrice, year);
            System.out.println("Список автомобілів року випуску " + year + ", ціна яких більше " + minPrice + ":");
            for (Car car : carsPrice) {
                System.out.println(car);
            }
        }
    }
}
