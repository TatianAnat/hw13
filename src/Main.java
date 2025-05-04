public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        DeterminesLeapYear(2021);
                }
//task 1
    public static void DeterminesLeapYear(int year){

        if (year > 1584) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year+" год - високосный год");
            } else {
                System.out.println(year + " год - невисокосный год");
            }
        }


    }

}