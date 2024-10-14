public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        fifthTask();
        sixthTask();
        seventhTask();
        eighthTask();
        ninthTask();
        tenthTask();
    }


    static void firstTask() {
        System.out.println("Задача 1 \n");

        for (int i = 1; i < 10 + 1; i++) {
            System.out.println(i);
        }

    }

    static void secondTask() {
        System.out.println("\nЗадача 2 \n");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    static void thirdTask() {
        System.out.println("\nЗадача 3 \n");

        for (int i = 0; i < 17 + 1; i += 2) {
            System.out.println(i);
        }

        // В этой задаче можно сделать по другому, но т. к. "магнитолу" нужно "прикрутить" чтобы она работала - сделаем по условию
        // я бы сделал как в задании 1, вывел все числа от 1 до 17 и через ветвление проверял четное число или же нет

    }

    static void fourthTask() {
        System.out.println("\nЗадача 4 \n");

        for (int i = 10; i > -10 - 1; i--) {
            System.out.println(i);
        }
    }

    static void fifthTask() {
        System.out.println("\nЗадача 5 \n");

        for (int i = 1904; i < 2096 + 1; i += 4) {
            System.out.println("Високосный год " + i);
        }

    }

    static void sixthTask() {
        System.out.println("\nЗадача 6 \n");

        for (int i = 7; i < 98 + 1; i += 7) {
            System.out.println(i);
        }

    }

    static void seventhTask() {
        System.out.println("\nЗадача 7 \n");

        for (int i = 1; i < 512 + 1; i *= 2) {
            System.out.println(i);
        }

    }

    static void eighthTask() {
        System.out.println("\nЗадача 8 \n");

        int mySavings = 0;

        for (int i = 1; i < 12 + 1; i++) {
            mySavings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + mySavings + " рублей");
        }

    }

    static void ninthTask() {
        System.out.println("\nЗадача 9 \n");

        int mySavings = 0;

        for (int i = 1; i < 12 + 1; i++) {
            mySavings += mySavings / 100; // т.к. Проценты не могут начисляться если зп упала на счет в конце месяца, только за целый месяц пребывания на счете
            mySavings += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + mySavings + " рублей");
        }

    }

    static void tenthTask() {
        System.out.println("\nЗадача 10 \n");
        byte myNum = 2;
        int result = 0;

        for (int i = 1; i < 10 + 1; i++) {
            result = myNum * i;
            System.out.println(myNum + " * " + i + " = " + result);
        }
    }
}





