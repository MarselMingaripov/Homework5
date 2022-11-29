public class Main {
    public static void main(String[] args) {

        boolean clientOS = true;
        short clientDeviceYear = 2015;
        if (clientOS)
            System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");

        if (clientDeviceYear >= 2015){
            if (clientOS)
                System.out.println("Установите версию приложения для Android по ссылке");
            else System.out.println("Установите версию приложения для iOS по ссылке");}
        else if (clientOS)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        int year = 2021;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0)
                    System.out.println(year + " является високосным");
                else System.out.println(year + " не является високосным");}
            else System.out.println(year + " является високосным");}
        else System.out.println(year + " не является високосным");

    }
}