public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println(" Установиет версию приложения для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println(" Установите версию приложения для Android по ссылке");
        } else {
            System.out.println(" операционна система не найдена");
        }

        // Задание 2
        int clientDeviceYear = 2010;
        if (clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.println("установите облегченную версию приложения для Андройд по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS == 0) {
            System.out.println(" установите облегченную версию для IOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("установите обычную версию приложения для Андроид");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("установите обычную версию приложения для IOS");
        }
        // Задание 3
        int year = 2016;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" Год является всокосным");
        } else {
            System.out.println(" год не является высокосным");
        }
        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println(" доставка занимает сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 100) {
            System.out.println(" доставка занимает двое суток");
        }


    }
}