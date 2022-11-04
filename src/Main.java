public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int iOS = 0;
        if (iOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версия приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        int clients = 0;
        if (clients == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");

            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версия приложения для Android по ссылке");
            } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0) {
            System.out.println("Год является високосным");
            if (year % 100 == 0) {
                System.out.println("Год является невисокосным");
                if (year % 400 == 0) {
                    System.out.println("Год является високосным");
                }
            }
        } else {
            System.out.println("Год является невисокосным");
        }


        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int deliveryDays = (deliveryDistance - 20) / 40 + 2;
        if (deliveryDistance > 20) {
            if (deliveryDays == 0) {
                System.out.println("Потребуется дней: " + deliveryDays);
            } else {
                System.out.println("Потребуется дней: " + deliveryDays);
            }
        } else {
            System.out.println("Потребуется дней: " + 1);
        }

        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");




        }





    }
}