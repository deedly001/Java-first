import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
//        fifthTask();
//        sixthTask();
//        seventhTask();
//        eighthTask();
//        ninthTask();
//        tenthTask();
    }


    static void firstTask() {
        System.out.println("Задача 1 \n");

        int[] firstArray = new int[3];
//        firstArray[0] = 1;
//        firstArray[1] = 2;
//        firstArray[6] = 3;
//        for (int i = 0; i < 3; i++) {
//            firstArray[i] = i + 1;
//        }

        double[] secondArray = {1.57, 7.654, 9.986};
        String[] userNames = {"Sergei", "Maxim", "Marina"};

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println(Arrays.toString(userNames));

    }

    static void secondTask() {
        System.out.println("\nЗадача 2 \n");

        int[] firstArray = new int[3];
        for (int i = 0; i < 3; i++) {
            firstArray[i] = i + 1;
        }
        double[] secondArray = {1.57, 7.654, 9.986};
        String[] userNames = {"Sergei", "Maxim", "Marina"};

        for (int i = 0; i < firstArray.length; i++) {
            if (i >= firstArray.length - 1) {
                System.out.println(firstArray[i]);
            } else {
                System.out.print(firstArray[i] + ", ");
            }
        }

        for (int i = 0; i < secondArray.length; i++) {
            if (i >= secondArray.length - 1) {
                System.out.println(secondArray[i]);
            } else {
                System.out.print(secondArray[i] + ", ");
            }
        }

        for (int i = 0; i < userNames.length; i++) {
            if (i >= userNames.length - 1) {
                System.out.println(userNames[i]);
            } else {
                System.out.print(userNames[i] + ", ");
            }
        }
    }

    static void thirdTask() {
        System.out.println("\nЗадача 3 \n");

        int[] firstArray = new int[3];

        for (int i = 0; i < 3; i++) {
            firstArray[i] = i + 1;
        }

        double[] secondArray = {1.57, 7.654, 9.986};
        String[] userNames = {"Sergei", "Maxim", "Marina"};

        for (int i = firstArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(firstArray[i]);
            } else {
                System.out.print(firstArray[i] + ", ");
            }
        }

        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(secondArray[i]);
            } else {
                System.out.print(secondArray[i] + ", ");
            }
        }

        for (int i = userNames.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(userNames[i]);
            } else {
                System.out.print(userNames[i] + ", ");
            }
        }
    }

    static void fourthTask() {
        System.out.println("\nЗадача 4 \n");

        int[] firstArray = new int[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (i % 2 == 0) {
                firstArray[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstArray));
    }

    static void fifthTask() {
        System.out.println("\nЗадача 5 \n");

    }

    static void sixthTask() {
        System.out.println("\nЗадача 6 \n");


    }

    static void seventhTask() {
        System.out.println("\nЗадача 7 \n");


    }

    static void eighthTask() {
        System.out.println("\nЗадача 8 \n");


    }

    static void ninthTask() {
        System.out.println("\nЗадача 9 \n");

    }

    static void tenthTask() {
        System.out.println("\nЗадача 10 \n");
    }
}





