import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2024);
        getDeviceLink(0, 2005);
        int deliveryDays = calculateDeliveryDays(95);
        System.out.println("Потребуется дней: " + deliveryDays);

    }
    // ДЗ-11 1.8. Методы
    // Задание 1
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }
    // Задание 2
    public static void getDeviceLink(int osType, int manufacturingYear) {
        if (osType != 1 && osType != 0) {
            throw new IllegalArgumentException("Неправилный тип");
        }
        int currentYear = LocalDate.now().getYear();
        if (manufacturingYear > currentYear) {
            throw new IllegalArgumentException("Неправельный год");
        }
        String osString = osType == 0 ? "IOS" : "Android";
        String versionString = manufacturingYear > 2015 ? "полную" : "облегченную";
        System.out.printf("Установите %s версию для %s по ссылке %n", versionString, osString);
    }
    // Задание 3
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
        }
    }
}

