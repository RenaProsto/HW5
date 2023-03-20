public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int clientOS = 0;
        int yearOs = 2022;
        int clientDeviceYear = 2015;
        String osName = clientOS == 0 ? "iOS" : "Android";

        String clientOsVervion = yearOs < clientDeviceYear ? " облегченную " : " ";
        System.out.println("Установите" + clientOsVervion + "версию приложения для " + osName + " по ссылке");
    }

        public static void task3 () {
            System.out.println("Задача 3");
            int year = 2021;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0  ) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");

            }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 234;

        boolean distance1 = deliveryDistance <= 20;
        boolean distance2 = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean distance3 = deliveryDistance > 60 && deliveryDistance <= 100;

        if (distance1) {
            System.out.println("Доставка занимает сутки");
        } else if (distance2) {
                System.out.println("Срок достаки займет 2 дня");
        } else if (distance3) {
                System.out.println("Срок достаки займет 3 дня");
        } else{
                System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 10;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Этот месяц принадлежит к сезону Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит к сезону Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит к сезону Осень");
            case 12:
                System.out.println("Этот месяц принадлежит к сезону Зима");
            default:
                System.out.println("Такого месяца в году нет");


        }


    }




}





