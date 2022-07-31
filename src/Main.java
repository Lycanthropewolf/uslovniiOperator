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
            System.out.println(" Год является высокосным");
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
        // Задание 5
        int monthNamder = 147;
        switch (monthNamder) {
            case 12:
            case 1:
            case 2:
                System.out.println(" зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(" летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(" осенний месяц");
                break;
            default:
                System.out.println(" такого месяца не существует");
        }


    }
}