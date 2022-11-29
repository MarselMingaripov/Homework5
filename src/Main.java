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
    }
}