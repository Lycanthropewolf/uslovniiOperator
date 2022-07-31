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


        // Задание 6
        int age = 15;
        int wage = 34_000;
        int solar = 1;
        if (age >= 23) {
            System.out.println(" предоставляем лимит в размере " + (3 * wage));
        } else if (age < 23) {
            System.out.println(" предоставляем лимит в размере " + (2 * wage));
        } else if (wage >= 50_000 && wage < 80_000) {
            System.out.println(" предоставляем лимит в размере " + ( 1.2 * wage) );
        }else if (wage>=80_000){
            System.out.println(" предоставляем лимит в размере " + ( 1.5 * wage));
        }

        // Задание 7
        double aGe = 25;
        double saLary = 90_000;
        double wantedSumm = 330_000;
        boolean loanApproved23 = 0.5* saLary > ((((0.1+ 0.01)* wantedSumm) + wantedSumm) / 12);
        boolean loanApproved30 = 0.5* saLary > ((((0.1+ 0.005) * wantedSumm) + wantedSumm) / 12);
        boolean loanApproved80 = 0.5* saLary > ((((0.1- 0.007) * wantedSumm) + wantedSumm) / 12);
        if (aGe < 23 && loanApproved23 ) {
            System.out.println(" Максимальный платеж при ЗП  " + saLary +" равен " + ((((0.1+ 0.01)* wantedSumm) + wantedSumm) / 12) + " рублей. Платеж по кредиту "  +  wantedSumm + " рублей. Кредит Одобрен" );
        } else if (aGe<30 && loanApproved30 ) {
            System.out.println(" Максимальный платеж при ЗП  " + saLary +" равен " + ((((0.1+ 0.005) * wantedSumm) + wantedSumm) / 12) + " рублей. Платеж по кредиту "  +  wantedSumm + " рублей. Кредит Одобрен" );
        } else if (saLary>=80_000 && loanApproved80) {
            System.out.println(" Максимальный платеж при ЗП  " + saLary +" равен " + ((((0.1- 0.007) * wantedSumm) + wantedSumm) / 12) + " рублей. Платеж по кредиту "  +  wantedSumm + " рублей. Кредит одобрен" );
        } else {
            System.out.println(" Кредит не одобрен");
        }
            
        }


    }







