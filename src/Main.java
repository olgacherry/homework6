public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();


    }

    public static void task1() {
        System.out.println("Задание 1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

    }

    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 7; i < 105; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        for (int i = 1; i < 1014; i = i * 2) {
            System.out.println(i);

        }
    }
    public static void task8() {
        System.out.println("Задание 8");
        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + money;
            System.out.println("Месяц " +i+" сумма накоплений равна "+total+" рублей");
        }

    }
    public static void task9() {
        System.out.println("Задание 9");
        int money = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total = total + total/100;
            total = total + money;
            System.out.println("Месяц " +i+" сумма накоплений равна "+total+" рублей");
        }

    }
    public static void task10() {
        System.out.println("Задание 10");
        int a = 2;
        for (int i = 1; i < 11; i=i+1) {
            System.out.println(a+"*"+i+"="+(i*a));
    }
}
}