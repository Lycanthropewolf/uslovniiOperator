public class Main {
    public static void main(String[] args) {
        // Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println(" Установиет версию приложения для IOS по ссылке");
        } else if (clientOS == 1)  {
                System.out.println(" Установите версию приложения для Android по ссылке");
        } else {
            System.out.println(" операционна система не найдена");}

        // Задание 2
        int clientDeviceYear = 2020;
        if (clientDeviceYear <= 2015 && clientOS==1) {
            System.out.println("установите облегченную версию приложения для Андройд по ссылке");
        } else if (clientDeviceYear <= 2015 && clientOS==0) {
            System.out.println(" установите облегченную версию для IOS по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS==1) {
            System.out.println("установите обычную версию приложения для Андроид");
        } else if (clientDeviceYear>2015 && clientOS==0) {
            System.out.println("установите обычную версию приложения для IOS");
        }
        // Задание 3


    }
}