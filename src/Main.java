import java.time.LocalDate;
public class Main {

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void suggestAppVersion(int osType, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear) {
            if (osType == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (osType == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (osType == 1) {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }
    public static int calculateDeliveryDays(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        checkLeapYear(2023);

    }
    public static void task2 () {
        System.out.println("Задача 2");
        suggestAppVersion(0, 2023);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays == -1) {
            System.out.println("Доставка невозможна.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }
}