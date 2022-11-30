public class Main {
    public static void main(String[] args) {

        boolean clientOS = true;
        short clientDeviceYear = 2015;
        if (clientOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");

        if (clientDeviceYear >= 2015) {
            if (clientOS)
                System.out.println("Установите версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        else System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        int year = 2021;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " является високосным");
                else System.out.println(year + " не является високосным");
            } else System.out.println(year + " является високосным");
        } else System.out.println(year + " не является високосным");

        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: " + deliveryTime);
        else if (deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else System.out.println("Потребуется дней: " + 4);

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца нет");
                break;
        }
    }
}