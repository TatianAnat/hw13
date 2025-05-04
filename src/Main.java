import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        DeterminesLeapYear(2021);

        System.out.println("Task 2");
        phoneAppVersion(0,2015);
    }

    //task 1
    public static void DeterminesLeapYear(int year) {

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год - високосный год");
            } else {
                System.out.println(year + " год - невисокосный год");
            }
        }


    }

    //task2
    public static void phoneAppVersion(int clienOS, int clientDeviceYear) {
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
}