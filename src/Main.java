public class Main {

  public static void main(String[] args) {

    firstTask();
    secondTask();
    thirdTask();
    fourthTask();
//    fifthTask();
//    sixthTask();
//    seventhTask();
//    eighthTask();
//    ninthTask();
//    tenthTask();
  }


  static void firstTask() {
    System.out.println("Задача 1 \n");

    int weekExpenses = 0;
    int[] cashArr = {3000, 5000, 7000, 4000, 4500};

    for (int i = 0; i <= cashArr.length - 1; i++) {
      weekExpenses += cashArr[i];
    }
    System.out.println("Сумма трат за месяц составила: " + weekExpenses + " рублей");
  }

  static void secondTask() {
    System.out.println("\nЗадача 2 \n");

    int[] cashArr = {9000, 5000, 2000, 4000, 4500};
    int minExpenses = cashArr[0];
    int maxExpenses = 0;

    for (int i = 0; i <= cashArr.length - 1; i++) {
      if (cashArr[i] >= maxExpenses) {
        maxExpenses = cashArr[i];
      }
      if (cashArr[i] <= minExpenses) {
        minExpenses = cashArr[i];
      }
    }
    System.out.println("Минимальная сумма трат за неделю составила " + minExpenses
        + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей.");
  }

  static void thirdTask() {
    System.out.println("\nЗадача 3 \n");

    int[] cashArr = {9000, 5000, 2000, 4000, 4500};
    int averageCount = 0;
    byte weekPerMonth = 4; // можно было записать просто числом

    for (int i = 0; i <= cashArr.length - 1; i++) {
      averageCount += cashArr[i];
    }
    System.out.println(
        "Средняя сумма трат за месяц составила " + averageCount / weekPerMonth + " рублей.");
  }

  static void fourthTask() {
    System.out.println("\nЗадача 4 \n");

    char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

    for (int i = reverseFullName.length - 1; i >= 0; i--) {
      System.out.print(reverseFullName[i]);
    }
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






