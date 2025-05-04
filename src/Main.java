import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        determinesLeapYear(2021);

        System.out.println("Task 2");
        determinesPhoneAppVersion(0, 2015);

        System.out.println("Task 3");
        System.out.println(calculationCardDeliveryDays(95));
    }

    //task 1
    public static void determinesLeapYear(int year) {

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год - високосный год");
            } else {
                System.out.println(year + " год - невисокосный год");
            }
        }

    }

    //task2
    public static void determinesPhoneAppVersion(int clienOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clienOS == 1) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");

            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            }
        }
        if (clienOS == 0) {
            if (clientDeviceYear >= currentYear) {
                System.out.println("Установите версию приложения для iOS  по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

    }

    //task3
    public static int calculationCardDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
            //System.out.println("Доставки нет");
        }
    }
}
